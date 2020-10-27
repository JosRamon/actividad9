import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in); 
	static int x = -1; 
	
	public static void main(String[] args) {
	Deck cartas = new Deck();			
		while(x != 0){
			
			try{
                             System.out.println("Bienvenidos al Poker");
                             System.out.println("1. Mezclar el deck");
                             System.out.println("2. Acomodar");
                             System.out.println("3. Sacar una carta");
                             System.out.println("0. Salir");
                             System.out.print("Introduce una opción: ");
			     x = Integer.parseInt(scanner.nextLine()); 
					
				switch(x){
				case 1: 
					cartas.mezclar();
					break;
				case 2: 
					cartas.acomodar();
					break;
				case 3: 
					cartas.random();
					break;				
				case 0: 
					System.out.println("Gracias por jugar");
					break;
				default:
					System.out.println("Numero invalido, intente otra vez");
                                        break;
				}				
			}catch(Exception e){
				System.out.println("Opcion no valida, intente de nuevo");
			}
		}
	}	
}