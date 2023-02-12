package definitivo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import definitivo.Pedido;
/**
 * 
 * 
 * @author joaquin
 *
 */
public class Cliente {
	/**
	 * variables
	 */
	String Nombre;
	String Apellidos;
	Date Fecha;

	String Telefono ;
	String Direccion;
	String Historial;
	Pedido pedido;
	Scanner sc = new Scanner(System.in);
	DateFormat formateador = new SimpleDateFormat("dd/M/yy");
	java.util.Date fecha = new Date();
/**
 * Constructor vacio
 */
	Cliente() {

	}
/**
 * Constructor con las siguientes variables
 * @param nombre
 * @param apellidos
 * @param fecha
 * @param telefono
 * @param direccion
 */
	Cliente(String nombre, String apellidos, Date fecha, String telefono, String direccion ) {
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Fecha = fecha;
		this.Telefono = telefono;
		this.Direccion = direccion;
	}

	/**
	 * Getters and setters
	 * @return
	 */
	public String getNombre() {
		return Nombre;
	}
/**
 * setters
 * @param nombre
 */
	public void setNombre(String nombre) {
		System.out.println("Crea tu nombre");
		Nombre = nombre;

	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getTelefono() {
		return Telefono;
	}
	/**
	 * Metodo para insertar al telefono  las siguientes restricciones
	 * @param Telefono
	 * @return
	 */

	public boolean setTelefono(String Telefono) {

		 if (Telefono.length() != 9) {
	            return false;
	        }
	        char primerDigito = Telefono.charAt(0);
	        return primerDigito == '6' || primerDigito == '7' || primerDigito == '8' || primerDigito == '9';
	    }

	    

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getHistorial() {
		return Historial;
	}

	public void setHistorial(String historial) {
		Historial = historial;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	
	/**
	 * Metodo para crear los clientes y insertar el telefono	 */
	public void rellenarDatos() {

		System.out.println(" nombre ");
		Nombre = sc.nextLine();
		System.out.println(" apellidos ");
		Apellidos = sc.nextLine();
		System.out.println(" direccion ");
		Direccion = sc.nextLine();
		
		while (true) {
            System.out.print("Ingrese el número de teléfono: ");
             Telefono = sc.nextLine();
            if (setTelefono(Telefono)) {
               
                break;
            } else {
                System.out.println("El número de teléfono no es válido. Debe tener 9 dígitos y comenzar con 6, 7, 8 o 9");
            }
           
        }
		 System.out.println("Número de teléfono válido: " + getTelefono());
		 System.out.println("la fecha de creacion es " + formateador.format(fecha));
    }
	
	}
	

	
			
