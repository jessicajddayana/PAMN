import java.util.Scanner; 
import java.io.*;
//para poder usar Scanner y algunos metodos

public class Tienda //se declara la clase tienda
{
	public static void main(String[] args)  
	{
		String x,y;  //declaramos dos variables de tipo alfanumerico
		int[] a;      //se declara un arreglo 
		int z=0, k=0; //se inicializan dos variables
		a = new int[1000];    //asignamos el tamaño del arreglo 
		//se inicia un ciclo 		
		do 
		{
		//se despliega la lista de productos 
		System.out.println("Eliga productos a comprar: \nBEBIDAS:");
		Bebida b1 = new Bebida();
		System.out.println("1)" + b1.nombre+ " " + "$"+ b1.precio + ".00");
		Bebida b2 = new Bebida("Refresco",10);
		System.out.println("2)" + b2.nombre+ " " + "$"+ b2.precio + ".00");
		
		System.out.println("\nBOTANA:");
		Botana bo1 = new Botana();
		System.out.println("3)" + bo1.nombre+ " " + "$"+ bo1.precio + ".00");
		Botana bo2 = new Botana("Chicharrones",11);
		System.out.println("4)" + bo2.nombre+ " " + "$"+ bo2.precio + ".00");

		System.out.println("\nCOMIDA: (solo se venden kg completos)");
		Comida c1 = new Comida();
		System.out.println("5)" + c1.nombre + " " + "$"+ c1.precio + ".00");
		Comida c2 = new Comida("jamon",25);
		System.out.println("6)" + c2.nombre+ " " + "$"+ c2.precio + ".00");
		
		System.out.println("\nIngrese nombre o numero de producto a comprar: ");
		Scanner esc1 = new Scanner(System.in);
		//escaneamos y convertimos a mayusculas para evitar errores 
		x = esc1.next().toUpperCase();
			//se hacen comparaciones para ver que pide el ususario
		switch(x)
			{
		    case "AGUA" :
		    	a[z] = b1.precio;
		       break; 
		    case "REFRESCO" :
		       a[z] = b2.precio;
		       break; 
		    case "PAPAS" :
		       a[z] = bo1.precio;
		       break; 
		    case "CHICHARRONES" :
		        a[z] = bo2.precio;
		       break; 
		    case "QUESO" :
		       a[z] = c1.precio;
		       break; 
		    case "JAMON" :
		        a[z] = c2.precio;
		       break; 
		    
		    default : 
	       		System.out.println("Error al ingresar nombre");
			}
			//System.out.println(a[z]); por si se necesita
		z++;

		System.out.println("¿Desea comprar algo mas? ingrese si/no");
		Scanner esc2 = new Scanner(System.in);
		y = esc2.next().toUpperCase();

		}//se hace un DO-WHILE para seguir comprando 
		while (y.equals("SI"));

		System.out.println("total de la compra");
		for(int s = 0;s < z;s++)
			{
				System.out.println("$" + a[s] + ".00");
			}
			//impresion de compras por separado
		for(int s = 0;s < z;s++)
			{
				k = k + a[s];
			}
		System.out.println("Costo total: " + "$" + k + ".00");
		//impresion del total
	}

}
