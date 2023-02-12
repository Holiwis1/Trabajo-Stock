package definitivo;
//atributos
public class Pedido {
	Cliente cliente;
	Producto producto1, producto2;
	Pasarelappago pago;
//constructor
	Pedido() {
		
	}
	//get y set
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

	
	
	//metodos
	public double importeTotal(Producto producto1, Producto producto2) {
		double total;
		total = producto1.getPrecio() * producto1.getCantidad() + producto2.getPrecio() * producto2.getCantidad();
		return total;
	}
	
	public double importeTotal1(Producto producto1) {
		double total1;
		total1 = producto1.getPrecio() * producto1.getCantidad();
		return total1;
	}
	
	public double importeTotal2(Producto producto1) {
		double total2;
		total2 = producto2.getPrecio() * producto2.getCantidad();
		return total2;
	}
	
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
	
