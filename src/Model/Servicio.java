package Model;

import java.time.LocalDate;
import java.util.Date;

public abstract class Servicio {

	private String cod_Contrato;
	private String dir_Instalacion;
	private LocalDate fecha_Instalacion;
	private LocalDate fecha_Facturacion;
	private Boolean activo;
	private String cod_medidor;
	private int attribute;
	private double val_MesActual;
	private double val_MesAnterior;

	public abstract void crearServicio();
	
	
	public String getCod_Contrato() {
		return this.cod_Contrato;
	}

	public void setCod_Contrato(String cod_Contrato) {
		this.cod_Contrato = cod_Contrato;
	}

	public String getDir_Instalacion() {
		return this.dir_Instalacion;
	}

	public void setDir_Instalacion(String dir_Instalacion) {
		this.dir_Instalacion = dir_Instalacion;
	}

	public LocalDate getFecha_Instalacion() {
		return this.fecha_Instalacion;
	}

	public void setFecha_Instalacion(LocalDate localDate) {
		this.fecha_Instalacion = localDate;
	}

	public LocalDate getFecha_Facturacion() {
		return this.fecha_Facturacion;
	}

	public void setFecha_Facturacion(LocalDate localDate) {
		this.fecha_Facturacion = localDate;
	}

	public Boolean getActivo() {
		return this.activo;
	}

	
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public String getCod_medidor() {
		return this.cod_medidor;
	}

	
	public void setCod_medidor(String cod_medidor) {
		this.cod_medidor = cod_medidor;
	}

	public int getAttribute() {
		return this.attribute;
	}

	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}

	public double getVal_MesActual() {
		return this.val_MesActual;
	}

	public void setVal_MesActual(double val_MesActual) {
		this.val_MesActual = val_MesActual;
	}

	public double getVal_MesAnterior() {
		return this.val_MesAnterior;
	}

	public void setVal_MesAnterior(double val_MesAnterior) {
		this.val_MesAnterior = val_MesAnterior;
	}

}