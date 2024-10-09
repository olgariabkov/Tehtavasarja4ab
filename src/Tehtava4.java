import java.util.ArrayList;
import java.util.Scanner;

public class Tehtava4 {

    private static ArrayList<Juoma> juomaLista = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\nvalitse toiminto: ");
            System.out.println("1. Lisää uusi juoma");
            System.out.println("2. Tulosta kaikki juomat");
            System.out.println("3. Lopeta");
            System.out.println("4. Valinta: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    lisääJuoma();
                    break;
                    case 2:
                        tulostaJuomat();
                        break;
                        case 3:
                            running = false;
                            System.out.println("Ohjelma päättyy");
                            break;
                            default:
                                System.out.println("Virhe");
            }
        }
    }

    //metodi uuden juoman lisäämiseksi
    public static void lisääJuoma() {
        System.out.println("Anna juoman nimi: ");
        String nimi = scanner.nextLine();

        System.out.println("Valitse vedentyyppi (1. STILLL, 2. SPARKLING):");
        int waterChoice = scanner.nextInt();
        scanner.nextLine();

        Water waterType;
        if (waterChoice == 1) {
            waterType = Water.STILL;
        } else if (waterChoice == 2) {
            waterType = Water.SPARKLING;
        } else {
            System.out.println("Virhe");
            waterType = Water.STILL;
        }
        //luodaan uusi juoma
        Juoma uusiJuoma = new Juoma(nimi, waterType);
        juomaLista.add(uusiJuoma);
        System.out.println("Juoma lisätty: " + uusiJuoma);
    }

    //metodi kaikkien juomien tulostamiseksi
    public static void tulostaJuomat() {
        if (juomaLista.isEmpty()) {
            System.out.println("Juomalista on tyhjä");
        } else {
            System.out.println("\nKaikki luodut juomat:");
            for (Juoma juoma : juomaLista) {
                System.out.println(juoma);
            }
        }
    }
}
