package mercadoCentral;

public class Servicio extends Factura {

	protected int cantidadDeUnidadConsumida;
	protected double costoPorUnidad;
	
	
	
	public Servicio(int unidadConsumida, double costoPorUnidad) {
		super();
		this.cantidadDeUnidadConsumida = unidadConsumida;
		this.costoPorUnidad = costoPorUnidad;
	}

	public int getCantidadDeUnidadConsumida() {
		return cantidadDeUnidadConsumida;
	}



	public void setCantidadDeUnidadConsumida(int unidadConsumida) {
		this.cantidadDeUnidadConsumida = unidadConsumida;
	}



	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}



	public void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}



	@Override
	public double getPrecio() {
		return this.getCostoPorUnidad() * this.getCantidadDeUnidadConsumida() ;
	}
	
	
}
