package PiedraPapelTijeras;

import java.util.Scanner;

public class SASEC4 {
	public static void main(String[]args) {
		//Se importa la libreria import Java.util.Scanner;
		//Se añadio System.in
		Scanner scaner = new Scanner(System.in);
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = scaner.nextLine();
	    //Se corrige turno de Jugador a 2 
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    String j2 = scaner.nextLine();
	    //Se añade equals para igualar las sentencias si estas coinciden
	    if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
	      //Se añaden Breaks en cada switch
	      switch(j1) {
	      //Se coloca j2.equals para indicar que la sentencias son iguales 
	        case "piedra":
	          if (j2.equals("tijeras")) {
	            g = 1;
	          }
	          break;
	          
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	            } 
	          break;
	          //Se corrige Tijera por tijeras
	        case "tijeras":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	         break;
	      }
	      
	      System.out.println("Gana el jugador " + g);
		
	      }
		scaner.close();
	    }		    
}
