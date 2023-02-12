package definitivo;





/**
 * 
 * @author joaquin
 *
 */
public class Stock {
	/**
	 * Variables para el stock + 2 arrays(el array String=cadena de texto,Int cantidad de un producto en stock.)
	 */
	private static final int MAX_PRODUCTOS = 10;
	  private String[] nombresProductos = new String[MAX_PRODUCTOS];
	  private int[] cantidades = new int[MAX_PRODUCTOS];
	  private int contadorProductos = 0;
	  
	  public void agregarProducto(String nombreProducto, int cantidad) {
	    if (contadorProductos < MAX_PRODUCTOS) {
	      nombresProductos[contadorProductos] = nombreProducto;
	      cantidades[contadorProductos] = cantidad;
	      contadorProductos++;
	    } else {
	      System.out.println("Lo siento, no se pueden agregar más productos al inventario.");
	    }
	  }
	  
	  public void seleccionarProducto(String nombreProducto) {
	    int indiceProducto = -1;
	    for (int i = 0; i < contadorProductos; i++) {
	      if (nombresProductos[i].equalsIgnoreCase(nombreProducto)) {
	        indiceProducto = i;
	        break;
	      }
	    }
	    if (indiceProducto != -1) {
	      if (cantidades[indiceProducto] > 0) {
	        cantidades[indiceProducto]--;
	        System.out.println("Producto seleccionado: " + nombresProductos[indiceProducto]);
	        System.out.println("Cantidad restante: " + cantidades[indiceProducto]);
	      } else {
	        System.out.println("Lo siento, el producto " + nombresProductos[indiceProducto] + " está agotado.");
	      }
	    } else {
	      System.out.println("Lo siento, no se encontró el producto " + nombreProducto + " en el inventario.");
	    }
	  }

}

