package mercadoCentral;

public class ProductoDeCoperativa extends Producto{

	public ProductoDeCoperativa(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

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
		return this.precio * 0.9;
	}

	@Override
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}