package definitivo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author joaquin
 *
 */


public class Main {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    Stock inventario = new Stock();
	    
	    while (true) {
	    	
	      System.out.print("Agregar producto (escriba 'agregar'), seleccionar producto (escriba 'seleccionar'), o salir (escriba 'salir'): ");
	      String entrada = scanner.next();
	      if (entrada.equalsIgnoreCase("salir")) {
	        break;
	      } else if (entrada.equalsIgnoreCase("agregar")) {
	        System.out.print("Ingrese el nombre del producto: ");
	        String nombreProducto = scanner.next();
	        System.out.print("Ingrese la cantidad de " + nombreProducto + " en stock: ");
	        int cantidad = scanner.nextInt();
	        inventario.agregarProducto(nombreProducto, cantidad);
	      }else if (entrada.equalsIgnoreCase("seleccionar")) {
	          System.out.print("Ingrese el nombre del producto a seleccionar: ");
	          String productoNombre = scanner.next();
	          inventario.seleccionarProducto(productoNombre);
		
	    }
		
		
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// VARIABLES
		int opcion = 0;

		Scanner sc = new Scanner(System.in);

		// OBJETOS
		/**
		 * Creacion objetos
		 */
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		Producto p3 = new Producto();
		Producto p4 = new Producto();
		Producto p5 = new Producto();

		Pedido pedido = new Pedido();
		

		/**
		 *  eleccion de creacion de productos y clientes
		 */
		while (opcion != 3) {

			System.out.println("<<< Crear (1)cliente (2)Producto  (3)Salir>>>");
			System.out.println("Cuando acabes de crear cliente y productos pulsar (3)Salir si no sobreescribes");
			opcion = sc.nextInt();
			
			if (opcion == 1) {

				// CLIENTE 1
				System.out.println("crea tu Primer cliente");
				c1.rellenarDatos();
				System.out.println("\n" + "<<<caracteristicas de tu cliente 1>>>");
				System.out.println("tu nombre es " + c1.getNombre() + "\n" + "tu apellido es " + c1.getApellidos()
						+ "\n" + "el telefono es " + c1.getTelefono());
				// CLIENTE 2
				System.out.println("crea tu Segundo cliente");
				c2.rellenarDatos();
				System.out.println("\n" + "<<<caracteristicas de tu cliente 2>>>");
				System.out.println("tu nombre es " + c2.getNombre() + "\n" + "tu apellido es " + c2.getApellidos()
						+ "\n" + "el telefono es " + c2.getTelefono());

				// CLIENTE 3
				System.out.println("crea tu tercer cliente");
				c3.rellenarDatos();
				System.out.println("\n" + "<<<caracteristicas de tu cliente 3>>>");
				System.out.println("tu nombre es " + c3.getNombre() + "\n" + "tu apellido es " + c3.getApellidos()
						+ "\n" + "el telefono es " + c3.getTelefono());

			} else if (opcion == 2) {
				// PRODUCTO 1
				System.out.println("Crea tu Primer producto");
				p1.crearProducto();
				System.out.println("Crea tu Segundo producto");
				p2.crearProducto();
				System.out.println("Crea tu Tercer producto");
				p3.crearProducto();
				System.out.println("Crea tu Cuarto producto");
				p4.crearProducto();
				System.out.println("Crea tu Quinto producto");
				p5.crearProducto();

			} else if (opcion == 3) {
				System.out.println("ya has creado todo");

			}
		}

		
		 
		int eleccion = 0;
		double total = 0;
		double total1 = 0;
		double total2 = 0;
		double total3 = 0;
		double total4 = 0;
		double total5 = 0;
		int count = 0;
		Producto eleccion1 = null, eleccion2 = null;

		
		/**
		 * Metodo telefono validar
		 */
		String telefono;
		do {
			System.out.println("Identificate con tu numero de telefono");
			telefono = sc.nextLine();
		} while (getClienteByNumero(telefono, c1, c2, c3) == null);
		Cliente clienteRegistrado = getClienteByNumero(telefono, c1, c2, c3);
		System.out.println("bienvenido " + clienteRegistrado.getNombre() + " " + clienteRegistrado.getApellidos());
		System.out.println("Bienvenido al infierno elija");
/**
 * imprimir menu que hhas credado anteriormente
 */
		System.out.println("(1)");
		p1.Mostrarmenu();
		System.out.println("(2)");
		p2.Mostrarmenu();
		System.out.println("(3)");
		p3.Mostrarmenu();
		System.out.println("(4)");
		p4.Mostrarmenu();
		System.out.println("(5)");
		p5.Mostrarmenu();
/**
 * Elecion de solo dos productos para el cliente
 */
		while (count < 2) {
			eleccion = sc.nextInt();

			switch (eleccion) {
			case 1:
				count++;
				if (eleccion1 == null) {
					eleccion1 = p1;
				}
				if (eleccion2 == null && eleccion1 != null) {
					eleccion2 = p2;
				}

				System.out.println("Ha elegido la opción");

				p1.getNombre();
				p1.getPrecio();
				p1.getCantidad();

				break;
			case 2:
				count++;

				if (eleccion1 == null) {
					eleccion1 = p1;
				}
				if (eleccion2 == null && eleccion1 != null) {
					eleccion2 = p2;
				}
				p2.getNombre();
				p2.getPrecio();
				p2.getCantidad();

				break;
			case 3:
				count++;

				if (eleccion1 == null) {
					eleccion1 = p1;
				}
				if (eleccion2 == null && eleccion1 != null) {
					eleccion2 = p2;
				}
				p3.getNombre();
				p3.getPrecio();
				p3.getCantidad();
				break;
			case 4:
				count++;

				if (eleccion1 == null) {
					eleccion1 = p1;
				}
				if (eleccion2 == null && eleccion1 != null) {
					eleccion2 = p2;
				}
				p4.getNombre();
				p4.getPrecio();
				p4.getCantidad();

				break;
			case 5:
				count++;

				if (eleccion1 == null) {
					eleccion1 = p1;
				}
				if (eleccion2 == null && eleccion1 != null) {
					eleccion2 = p2;
				}
				p5.getNombre();
				p5.getPrecio();
				p5.getCantidad();

				break;
			}

		}
		/**
		 * Donde se guardan los productos elegidos arriba
		 */
		pedido.setProducto1(eleccion1);
		pedido.setProducto2(eleccion2);
/**
 * Donde se produce el pago de la clase 
 */
		Pasarelappago pago = new Pasarelappago(pedido.pago());
			//TIKECT
		/**
		 * Ticket donde se muestra cantidad, precio, total de los productos
		 */
		System.out.println("\n");
		pago.elegirPago();
		System.out.println(" CANT. " + " PRODUCTO " + " PRECIO " + "TOTAL");
		System.out.println(" ===== " + " ===== " + " =======" + " ========");
		System.out.println(
				"--- " + pedido.getProducto1().getCantidad() + "--- " + " " + pedido.getProducto1().getNombre() + "--- "
						+ " " + pedido.getProducto1().getPrecio() + "€" + "--- " + " " + pedido.pagopro1() + "€");
		System.out.println(
				"--- " + pedido.getProducto2().getCantidad() + "--- " + " " + pedido.getProducto2().getNombre() + "--- "
						+ " " + pedido.getProducto2().getPrecio() + "€" + "--- " + " " + pedido.pagopro1() + "€");
		pedido.getProducto1();
		pedido.getProducto2().getCantidad();
		System.out.println("\n");
		System.out.println("TOTAL --------------------------> " + pedido.importeTotal(eleccion1, eleccion2) + "€");
		System.out.println("\n");
		System.out.println("<---- TICKET---->");

	}

	/**
	 * Metodo para validar el telefono 
	 * @param numero
	 * @param c1
	 * @param c2
	 * @param c3
	 * @return
	 */
	public static Cliente getClienteByNumero(String numero, Cliente c1, Cliente c2, Cliente c3) {

		if (c1.getTelefono().equals(numero)) {
			return c1;
		} else if (c2.getTelefono().equals(numero)) {
			return c2;
		} else if (c3.getTelefono().equals(numero)) {
			return c3;
		} else {
			return null;

		}
		
		

	}
}
