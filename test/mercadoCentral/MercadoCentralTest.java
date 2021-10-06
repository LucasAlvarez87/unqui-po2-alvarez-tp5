package mercadoCentral;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class MercadoCentralTest {

	private ProductoDeEmpresaTradicional arroz;
	private ProductoDeCoperativa detergente;
	private ProductoDeCoperativa vino;
	private ProductoDeEmpresaTradicional queso;
	private Caja caja;
	private Servicio servicio;
	private Impuesto impuesto;
	
	
	@BeforeEach																																		
	public void setUp() {
		arroz = new ProductoDeEmpresaTradicional("Arroz", 18.9d);
		detergente = new ProductoDeCoperativa("Detergente", 75d);
		vino = new ProductoDeCoperativa("Detergente", 200d);
		queso = new ProductoDeEmpresaTradicional("Queso", 50d);
		servicio = new Servicio(5, 500d);
		impuesto = new Impuesto(1800d);
		caja = new Caja();
		caja.pasarPorCaja(arroz);
		caja.pasarPorCaja(detergente);
		caja.pasarPorCaja(queso);
		caja.pasarPorCaja(vino);
		caja.pasarPorCaja(servicio);
		caja.pasarPorCaja(impuesto);
		
	}
	
	@Test
	public void testDePrecioDeProductos() {
		double precioDeArroz = arroz.getPrecio();
		double precioDeDetergente = detergente.getPrecio();
		assertEquals(precioDeArroz, 18.9d, 0);
		assertEquals(precioDeDetergente,67.5d,0);
	}
	
	/*
	@Test
	public void testTotalDeCaja() {
		double amount = caja.montoTotalAPagar();
		assertEquals(amount,316.4d,0);
	}
	*/
	
	@Test
	public void testDePrecioDeFacturas() {
		double precioDeServicio = servicio.getPrecio();
		double precioDeImpuesto = impuesto.getPrecio();
		assertEquals(precioDeServicio,2500d,0);
		assertEquals(precioDeImpuesto,1800d,0);
	}
	
	@Test 
	public void testTotalPorCaja2() {
		double total = caja.montoTotalAPagar();
		assertEquals(total, 4616.4d, 0);
	}
	
}
