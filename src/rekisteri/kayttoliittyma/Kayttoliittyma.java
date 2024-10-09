package rekisteri.kayttoliittyma;

import rekisteri.henkilot.Henkilo;

public class Kayttoliittyma {
    //metodi henkilön näyttämiseksi
    public void naytaHenkilo(Henkilo henkilo) {
        System.out.println("Henkilön tiedot: ");
        System.out.println("Nimi: " + henkilo.getNimi());
        System.out.println("Ikä: " + henkilo.getIka());

    }
}
