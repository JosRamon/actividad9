import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Deck {       
    String[] palo = {"Picas","Corazones","Diamantes","Tréboles"};
    String[] carta = {"as","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","jota","reina","rey"};
    int x; 
    public static final int DECK = 52;   
    
    public void mezclar()
    {
        System.out.println("Se mezclo el Deck");
    }    
   public void acomodar()
    {
        ArrayList<Integer> deck = new ArrayList<Integer>();
        for (int x = 0; x < DECK; ++x)
        {
            deck.add(x);
        }
        Collections.shuffle(deck);
        System.out.println(deck);
    }        
    public void random()
    {
        int iPalo = (int)(Math.random()*4);
        int iCarta = (int)(Math.random()*13);
        System.out.println("Carta: " + carta[iCarta] + " de " + palo[iPalo]);
    }       
}