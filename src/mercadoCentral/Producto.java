package mercadoCentral;

public abstract class Producto implements PasablePorCaja {

	protected String nombre;
	protected double precio;
	
	

	abstract public String getNombre();
	

	abstract public void setNombre(String nombre);
	

	abstract public double getPrecio() ;
	

	abstract public void setPrecio(double precio) ;
	
	
}
