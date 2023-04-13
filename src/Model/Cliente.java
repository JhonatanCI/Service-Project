package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Cliente {

	public  static ObservableList<Servicio> servicio =  FXCollections.observableArrayList();
	private String nombre;
	private String id;
	private LocalDate fecha_Registro;
	private String cod_Contrato;
	private String dir_Facturacion;
	private String tel_Contacto;
	private String email;
	private Estado state;
	private ArrayList<Servicio> servicios;

	public Cliente(){
		
	}
	public Cliente(String nombre, String id, LocalDate fecha_Registro, String cod_Contrato, String dir_Facturacion,  String tel_Contacto, String email,Estado state){
		servicios = new ArrayList<Servicio>();
		this.nombre= nombre;
		this.id = id;
		this.fecha_Registro= fecha_Registro;
		this.cod_Contrato= cod_Contrato;
		this.dir_Facturacion=dir_Facturacion;
		this.tel_Contacto=tel_Contacto;
		this.email=email;
		this.state=state;
			
	}

	public String getNombre() {
		return this.nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estado getState() {
		return this.state;
	}


	public void setState(Estado state) {
		this.state = state;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getFecha_Registro() {
		return this.fecha_Registro;
	}

	public void setFecha_Registro(LocalDate fecha_Registro) {
		this.fecha_Registro = fecha_Registro;
	}

	public String getCod_Contrato() {
		return this.cod_Contrato;
	}

	public void setCod_Contrato(String cod_Contrato) {
		this.cod_Contrato = cod_Contrato;
	}

	public String getDir_Facturacion() {
		return this.dir_Facturacion;
	}

	public void setDir_Facturacion(String dir_Facturacion) {
		this.dir_Facturacion = dir_Facturacion;
	}

	public String getTel_Contacto() {
		return this.tel_Contacto;
	}

	public void setTel_Contacto(String tel_Contacto) {
		this.tel_Contacto = tel_Contacto;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void CrearServicio() {
		
	}

	public void actualizar_Servicio() {
	
	}

	public void inactivar_Servicio() {
		
	}

	public Collection<Servicio> consultar_Servicios() {
	 return servicio;
	}
	
	
	public void addServicio(Servicio servicio) {
		this.servicios.add(servicio);
	}
	
	public ArrayList<Servicio> getServicios() {
		return servicios;
	}

}