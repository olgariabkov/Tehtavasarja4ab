package rekisteri.henkilot;

public class Henkilo {
    private String nimi;
    private int ika;

    //konstruktori
    public Henkilo(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }

    //getter
    public String getNimi() {
        return nimi;
    }

    public int getIka() {
        return ika;
    }

    //tostring
    @Override
    public String toString() {
        return "Henkilo{" +
                "nimi='" + nimi + '\'' +
                ", ika=" + ika +
                '}';
    }
}
