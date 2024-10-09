package rekisteri;

import rekisteri.henkilot.Henkilo;
import rekisteri.kayttoliittyma.Kayttoliittyma;

public class Main {
    public static void main(String[] args) {

        //luodaan henkilo olio
        Henkilo henkilo1 = new Henkilo("John Bon", 32);
        Henkilo henkilo2 = new Henkilo("Mari Virtanen", 25);

        //luodaan kayttoliittyma olio
        Kayttoliittyma kayttoliittyma = new Kayttoliittyma();

        //käytetään käyttoliittymaluokka henkilöiden näyttämiseen
        kayttoliittyma.naytaHenkilo(henkilo1);
        kayttoliittyma.naytaHenkilo(henkilo2);

    }
}
