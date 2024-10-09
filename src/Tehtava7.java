import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class Tehtava7 {


    public static void main(String[] args) throws FileNotFoundException {

        //luodaan Food objektit
        Food meat = new Food("Meat", 200, 20.00);
        Food vegetables = new Food("Vegetables", 150, 7.40);
        System.out.println("Food: " + meat);
        System.out.println("Food: " + vegetables);

        //luodaan Ticket obj
        Ticket ticket = new Ticket(15.00, "John Bon", LocalDate.now());
        System.out.println("Ticket: " + ticket);

        //luuodaan Enclosure ja lisätään dino
        Enclosure enclosure = new Enclosure();


        //System.out.println(park);


        //luodaan dinosauruksia
        Dinosaur dino1 = new Dinosaur("T-Rex", 12, "Carnivore");
        Dinosaur dino2 = new Dinosaur("Velociraptor", 7, "Carnivore");
        Dinosaur dino3 = new Dinosaur("Triceratops", 15, "Herbivore");

        enclosure.addDinosaur(dino1);
        enclosure.addDinosaur(dino2);
        enclosure.addDinosaur(dino3);

        //näytetään kaikki dinosaurukset
        enclosure.listDinosaurs();

        //poistetaan ensimmäinen ja näytetään lista
        enclosure.removeDinosaur(0);
        enclosure.listDinosaurs();
    }
}
