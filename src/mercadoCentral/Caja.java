package mercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	
		private List <PasablePorCaja> pasados = new ArrayList <PasablePorCaja>();

		public Caja() {
			super();
		}

		public List<PasablePorCaja> getProductos() {
			return this.pasados;
		}
		
		public void pasarPorCaja(PasablePorCaja producto) {
			this.getProductos().add(producto);
		}
		
		public double montoTotalAPagar() {
			Double total =  0d;
			for (PasablePorCaja producto:this.getProductos()) {
				total += producto.getPrecio();
			}
			return total;
		}
}