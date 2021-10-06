package mercadoCentral;


public class ProductoDeEmpresaTradicional extends Producto {

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}

	@Override
	public double getPrecio() {
		return this.precio ;
	}

	@Override
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public ProductoDeEmpresaTradicional(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	
}