package mercadoCentral;

public class Impuesto extends Factura{

	protected double tasaDeServicio;
	
	

	public Impuesto(double tasaDeServicio) {
		super();
		this.tasaDeServicio = tasaDeServicio;
	}

	public double getTasaDeServicio() {
		return tasaDeServicio;
	}

	public void setTasaDeServicio(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}

	@Override
	public double getPrecio() {
		return this.getTasaDeServicio();
	}

}
