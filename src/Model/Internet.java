package Model;

public class Internet extends Servicio {
	private TipoDeContrato tipoDeContrato;
	private int megasIncluidas;
	private int megasConsumidas;
	
	@Override
	public void crearServicio() {
		// TODO Auto-generated method stub
		
	}
	public void setTipoDeContrato(String tipoDeContrato) {
		if(tipoDeContrato.equalsIgnoreCase("Limitado")) {
			this.tipoDeContrato=TipoDeContrato.LIMITADO;
		}else if(tipoDeContrato.equalsIgnoreCase("Ilimitado")) {
			this.tipoDeContrato=TipoDeContrato.ILIMITADO;
		}else if(tipoDeContrato.equalsIgnoreCase("Prepago")){
			this.tipoDeContrato=TipoDeContrato.PREPAGO;
		}
	}
	public TipoDeContrato getTipoDeContrato() {
		return tipoDeContrato;
	}	
	public void setMegasConsumidas(int megasConsumidas) {
		this.megasConsumidas = megasConsumidas;
				
	}
	public double getMegasConsumidas() {
		return megasConsumidas;
	}
	public void setMegasIncluidas(int megasIncluidas) {
		if(tipoDeContrato==TipoDeContrato.ILIMITADO) {
			this.megasIncluidas=999999999;
		}else {
			this.megasIncluidas = megasIncluidas;
		}
		
	}
	public double getMegasIncluidas() {
		return megasIncluidas;
	}

}
