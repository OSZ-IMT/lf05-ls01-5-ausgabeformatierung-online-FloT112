/**
 * Lesen Sie das Informationsblatt zur Ausgabeformatierung und bearbeiten Sie die Aufgaben in dem Übungsblatt "AB-Ausgabeformatierung".
 * Aufgabe
 *
 * Achtung: Für jede Aufgabe soll mindestens ein Commit duchgeführt und das Endergebnis mit Hilfe von "push" in das zentrale Repository
 * hochgeladen werden.
 *
 * Aufgaben Sie Moodle.
 */
public class Ausgabenformatierung {

    /**
     * Main Methode, die alle anderen Methoden aufruft
     * @param args, default
     */
    public static void main(String[] args) {

        // Aufruf der 3 Methoden
        // Wenn man nur eine Aufgabe ausgeben will, einfach die anderen auskommentieren
        aufgabe1();
        aufgabe2();
        aufgabe3();
    }


    public static void aufgabe1(){

      System.out.println("   **   ");
      System.out.println("*      *");
      System.out.println("*      *");
      System.out.println("   **   ");
      
    }

    public static void aufgabe2(){
      System.out.printf("%-5s = %-18s = %4d\n", "0!", "", 1);
      System.out.printf("%-5s = %-18s = %4d\n", "1!", "1", 1);
      System.out.printf("%-5s = %-18s = %4d\n", "2!", "1 * 2", 2);
      System.out.printf("%-5s = %-18s = %4d\n", "3!", "1 * 2 * 3", 6);
      System.out.printf("%-5s = %-18s = %4d\n", "4!", "1 * 2 * 3 * 4", 24);
      System.out.printf("%-5s = %-18s = %4d\n", "5!", "1 * 2 * 3 * 4 * 5", 120);
    }

    public static void aufgabe3(){

      String a = "Fahrenheit";
      String b = "Celsius";

      System.out.printf("%-12s|%10s", a, b);
      System.out.printf("\n----------------------\n");

      int hi=-20;

      while (hi<=30){
        double celsius = (5.0/9.0) * (hi - 32.0);
        System.out.printf("%+-12d|%18.2f\n", hi, celsius);
        hi += 10;
      }

    }
}
