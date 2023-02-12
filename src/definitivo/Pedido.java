package definitivo;
/**
 * 
 * @author joaquin
 *
 */
public class Pedido {
	/**
	 * variables
	 */
	Cliente cliente;
	Producto producto1, producto2;
	Pasarelappago pago;
/**
 * constructor vacio
 */
	Pedido() {
		
	}
	/**
	 * getters and  setters
	 * @return
	 */
	public Producto getProducto1() {
		return producto1;
	}

	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}

	public Producto getProducto2() {
		return producto2;
	}

	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}

	
	
	/***
	 * metodo que calcula la cantidad y el precio  total de dos productos
	 * @param producto1
	 * @param producto2
	 * @return
	 */
	public double importeTotal(Producto producto1, Producto producto2) {
		double total;
		total = producto1.getPrecio() * producto1.getCantidad() + producto2.getPrecio() * producto2.getCantidad();
		return total;
	}
	/**
	 * metodo que calcula la cantidad y precio de producto 1
	 * @param producto1
	 * @return
	 */
	public double importeTotal1(Producto producto1) {
		double total1;
		total1 = producto1.getPrecio() * producto1.getCantidad();
		return total1;
	}
	/*-
	 * importe total producto 2
	 */
	
	public double importeTotal2(Producto producto1) {
		double total2;
		total2 = producto2.getPrecio() * producto2.getCantidad();
		return total2;
	}
	/**
	 * 
	 * @return
	 */
	
	public double pagopro1() {
		return importeTotal1( producto1 );
	}
	
	public double pagopro2() {
		return importeTotal2( producto2 );
	}

	public double pago() {
		return importeTotal(producto1, producto2);

	}
	
		
}
	
