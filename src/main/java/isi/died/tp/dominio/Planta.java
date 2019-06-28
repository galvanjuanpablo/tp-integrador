package isi.died.tp.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Planta {
	private Integer id;
	private String nombre;
	private ArrayList<Stock> stock;
	
	public Double costoTotal() {
		return stock.stream().mapToDouble((e)-> e.obtenerCosto()*e.getCantidad()).sum();
	}
	public List<Insumo> stockEntre(Integer s1, Integer s2){
		Predicate<Stock> predi = (pre) -> (pre.getCantidad()<s2 && pre.getCantidad()>s1);
		return stock.stream().filter(predi).map(s -> s.getInsumo()).collect(Collectors.toList());
	}
	public Boolean necesitaInsumo(Insumo i) {
		if(stock.stream().filter(p -> p.getInsumo() == i && p.getCantidad()<p.getPuntoPedido())!=null)
			return true;
		else return false;
	}
}

