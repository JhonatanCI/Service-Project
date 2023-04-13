package Model;

public class Telefonia extends Servicio{

	private TipoDeContrato tipoDeContrato;
	private int minutosLocales;
	private int minutosInternacionales;
	private int consumoLocal;
	private int consumoInternacional;
	
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
	
	public void setMinutosLocales(int minutos) {
		if(tipoDeContrato==TipoDeContrato.ILIMITADO) {
			minutosLocales=99999;
		}else {
			minutosLocales=minutos;
		}
	}
	
	public int getMinutosLocales() {
		return minutosLocales;
	}
	public void setMinutosInternacionales(int minutosInternacionales) {
		if(tipoDeContrato==TipoDeContrato.ILIMITADO) {
			minutosInternacionales=99999;
		}else {
			this.minutosInternacionales=minutosInternacionales;
		}
	}
	
	public int getMinutosInternacionales() {
		return minutosInternacionales;
	}
	
	public TipoDeContrato getTipoDeContrato() {
		return tipoDeContrato;
	}
	
	public void setConsumoMinutos (int consumoMinutos) {
		this.consumoLocal=consumoMinutos;
	}
	public int getConsumoLocal() {
		return consumoLocal;
	}
	public void setConsumoInternacional(int consumoInternacional) {
		this.consumoInternacional = consumoInternacional;
	}
	public int getConsumoInternacional() {
		return consumoInternacional;
	}

}
