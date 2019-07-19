import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    /**
     * Summenbilder
     */
    public static void main(String[] args){
        // Implementieren Sie ein Programm, dass so lange Eingaben 
        // annimmt bis eine 0 eingegeben wird. Danach werden alle Zahlen der 
        // Reihe nach als formatierte Summe ausgegeben, z.B. “3 + 4 + 17 = 24”
        // Tipp: Die Methode scanner.readInt() liest eine neue Ganzzahl von der Konsole ein

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> zahlen = new ArrayList<Integer>();
        
        int neueZahl;
        do {
            neueZahl = scanner.nextInt();
            zahlen.add(neueZahl);
        } while(neueZahl != 0);

        String ausgabe = "";
        int summe = 0;
        for(int i = 0; i< zahlen.size(); i++){
            summe += zahlen.get(i);
            ausgabe += zahlen.get(i) + " + ";
        }
        System.out.println(ausgabe + "= " + summe);
    }
    
}
