package Model;

import java.time.LocalDate;
import java.util.Date;

public class Servicio {

	private String dir_Instalacion;
	private LocalDate fecha_Instalacion;
	private LocalDate fecha_Facturacion;
	private Boolean activo;
	private String cod_medidor;
	private double val_MesActual;
	private double val_MesAnterior;
	private String idCliente;

	public Servicio(){}

	public Servicio( String dir_Instalacion, LocalDate fecha_Instalacion, LocalDate fecha_Facturacion,
			Boolean activo, String cod_medidor, double val_MesActual, double val_MesAnterior,String idCliente) {
			this.dir_Instalacion = dir_Instalacion; 
			this.fecha_Instalacion = fecha_Instalacion; 
			this.fecha_Facturacion = fecha_Facturacion;
			this.activo = activo;
			this.cod_medidor= cod_medidor; 
			this.val_MesActual = val_MesActual;
			this.val_MesAnterior = val_MesAnterior;
			this.idCliente = idCliente;
	}

	public String getIdCliente() {
		return this.idCliente;
	}

	public void setTdCliente(String idCliente) {
		this.idCliente = idCliente;
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

	public void setFecha_Instalacion(LocalDate fecha_Instalacion) {
		this.fecha_Instalacion = fecha_Instalacion;
	}

	public LocalDate getFecha_Facturacion() {
		return this.fecha_Facturacion;
	}

	public void setFecha_Facturacion(LocalDate fecha_Facturacion) {
		this.fecha_Facturacion = fecha_Facturacion;
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