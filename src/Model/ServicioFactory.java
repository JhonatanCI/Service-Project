package Model;

import controller.CrearServicioController;

public class ServicioFactory {
	private CrearServicioController servController;
	
	public Servicio obtenerServicio(ServiciosEnum tipoDeServicio) {
		Servicio servicio = null;
		switch (tipoDeServicio) {
			case AGUA:
				servicio= new Agua();
				servicio.setCod_medidor(servController.codMedidor);
			case ENERGIA:
				servicio= new Energia();
				servicio.setCod_medidor(servController.codMedidor);
			case GAS:
				servicio= new Gas();
				servicio.setCod_medidor(servController.codMedidor);
			case INTERNET:
				servicio= new Internet();
				if (servicio instanceof Internet) {
					Internet serviciocast= (Internet) servicio;
					serviciocast.setMegasIncluidas(servController.megasInc);
					serviciocast.setMegasConsumidas(0);
					servicio=serviciocast;
				}
				
			case TELEFONIA:
				servicio= new Telefonia();
				
				if (servicio instanceof Telefonia) {
					Telefonia serviciocast= (Telefonia) servicio;
					serviciocast.setMinutosInternacionales(servController.minI);
					serviciocast.setMinutosLocales(servController.minL); 
					serviciocast.setConsumoInternacional(0);
					serviciocast.setConsumoMinutos(0);
					servicio=serviciocast;
				}
				break;
			
				
			default:
				break;
		}
			if(servicio!=null) {
				servicio.setActivo(true);
				servicio.setCod_Contrato(servController.codContrato);
				servicio.setDir_Instalacion(servController.dirInsta);
				servicio.setFecha_Facturacion(servController.fechaFact);
				servicio.setFecha_Instalacion(servController.fechaInsta);
				
			}
		
		return servicio;
	}
	
	public void setController(CrearServicioController servController) {
		this.servController=servController;
	}
}
