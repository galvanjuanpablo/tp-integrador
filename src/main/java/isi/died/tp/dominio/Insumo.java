package isi.died.tp.dominio;

public class Insumo {
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public boolean isEsRefrigerado() {
		return esRefrigerado;
	}
	public void setEsRefrigerado(boolean esRefrigerado) {
		this.esRefrigerado = esRefrigerado;
	}
	public Unidad getUnidadDeMedida() {
		return unidadDeMedida;
	}
	public void setUnidadDeMedida(Unidad unidadDeMedida) {
		this.unidadDeMedida = unidadDeMedida;
	}
	private String descripcion;
	private Double costo;
	private Integer stock;
	private Double peso;
	private boolean esRefrigerado;
	private Unidad unidadDeMedida;

}
