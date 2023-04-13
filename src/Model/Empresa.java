package Model;

import java.time.LocalDate;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Empresa {

	private String direccion;
	private String nombre;
	public static ObservableList<Cliente> clientes = FXCollections.observableArrayList();
	public static ObservableList<Servicio> servicios = FXCollections.observableArrayList();
	public void registrarCliente(String nombre, String id, LocalDate f_R, String c_c, String d_F, String t_C, String e,Estado state) {
		clientes.add(new Cliente(nombre,id,f_R,c_c,d_F,t_C,e,state));
	}

	
	public void editarCliente(String nombre, String id, LocalDate f_R, String c_c, String d_F, String t_C, String e,Estado state) {

		clientes.get(consultarClientePos(id)).setNombre(nombre);
		clientes.get(consultarClientePos(id)).setFecha_Registro(f_R);
		clientes.get(consultarClientePos(id)).setCod_Contrato(c_c);
		clientes.get(consultarClientePos(id)).setDir_Facturacion(d_F);
		clientes.get(consultarClientePos(id)).setTel_Contacto(t_C);
		clientes.get(consultarClientePos(id)).setEmail(e);
		clientes.get(consultarClientePos(id)).setState(state);

	}

	
	public void eliminarCliente(String id) {
		clientes.remove(consultarClientePos(id));
	}

	
	public static Cliente consultarCliente(String id) {
		Cliente cliente= new Cliente();
		for (int i = 0; i <clientes.size(); i ++) {
			if(id.equalsIgnoreCase(clientes.get(i).getId())){
				cliente = clientes.get(i);
			}
		  }
		return cliente;
	}

	public static void addServClient(String id,Servicio servicio) {
		Cliente cl = consultarCliente(id);
		cl.addServicio(servicio);
		servicios.add(servicio);
		
	}
	
	public int consultarClientePos(String id) {
		int cliente = -1;
		for (int i = 0; i <clientes.size(); i ++) {
			if(id.equalsIgnoreCase(clientes.get(i).getId())){
				cliente = i;
			}
		  }
		return cliente;
	}

	public void setDireccion(String direccion){
		this.direccion = direccion;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getDireccion(){
		return direccion;
	}

	public String getNombre(){
		return nombre;
	}


}