package mercadoCentral;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ColeccionadorDeObjetos {
 
	public Object getFirstFrom(List collection) {
		return collection.get(0);
	}
	
	/*
	 * Colección: get no esta definida en la interfaz
	 * List: get es mensaje de de la interfaz por lo tanto
	 * ArrayList y List lo pueden utilizar
	 */
	
	public void addLast(Object element, YYY collection) {
		collection.add(element);
	}
	
	/*
	 * La interfaz Collection tiene implementado el mensaje
	 * add por lo tanto el resto lo tiene
	 */
	
	public Collection getSubCollection(ZZZ collection, int from, int to) {
		return collection.subList(from,to);
	}
	
	/*
	 * Collection no tiene implementado sublist pero List si 
	 * por lo tanto ArrayList y LinkedList tambien
	 */
	public Boolean containElement(WWW collection, Object element) {
		return collection.contains(element);
	}
	
	/*
	 * La interfaz Collection tiene implementado el mensaje
	 * contains por lo tanto el resto lo tiene
	 */
	
	public static void main(String[] args) {
	
	}
	
}
