package definitivo;

import java.util.Scanner;

/**
 * 
 * @author joaquin
 *
 */
public class Producto {
	/**
	 * Variables
	 */
	String Nombre;
	Double Precio;
	int Cantidad;
	Scanner sc = new Scanner(System.in);

	/**
	 * constructor vacio
	 */
	Producto() {

	}

	/*
	 * getters and setters
	 */
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Double getPrecio() {
		return Precio;
	}

	public void setPrecio(Double precio) {
		Precio = precio;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	/**
	 * metodo que utilizo para crear los productos en el main
	 */
	public void crearProducto() {
		System.out.println("añade el producto");
		Nombre = sc.nextLine();
		System.out.println("Cuanto quieres que cueste");
		Precio = sc.nextDouble();
		System.out.println("Cuantas quieres tener");
		Cantidad = sc.nextInt();
	}
	/**
	 * metodo que utilizo para mostrar el nombre y el precio con los productos ya creados
	 */
	public void Mostrarmenu() {

		System.out.println("plato " + getNombre() + " cuesta " + getPrecio() + "$");

	}

}
