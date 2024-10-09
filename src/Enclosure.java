import java.util.ArrayList;

public class Enclosure {

    private ArrayList<Dinosaur> dinosaurs; //lista Dinosaur objekteista

    public Enclosure() {
        this.dinosaurs = new ArrayList<>();
    }


    //metodi dinosautuksen lisäämiseksi
    public void addDinosaur(Dinosaur dino) {
        dinosaurs.add(dino);
    }

//metodi dinosauruksen poistamiseksi
public void removeDinosaur(int index) {
    if (index >= 0 && index < dinosaurs.size()) {
        Dinosaur removedDino = dinosaurs.remove(index);
        System.out.println("Removed: ");
    } else {
        System.out.println("Cannot remove dinosaur");
    }
}

//metodi kaikkien dinosaurusten näyttämiseksi
    public void listDinosaurs() {
        if (dinosaurs.isEmpty()) {
            System.out.println("Enclosure is empty!");
        } else {
            System.out.println("Dinosaurs in the enclosure:");
            for (int i = 0; i < dinosaurs.size(); i++) {
                System.out.println((i + 1) + ". " + dinosaurs.get(i));
            }
        }
    }
}
