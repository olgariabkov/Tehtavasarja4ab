public class Tehtava2 {

    public static void addTogether(int a, String b) {
        System.out.println(a + b);
    }

    public static void addTogether(String a, int b) {
        System.out.println(a + b);
    }

    public static void addTogether(String a, String b) {
        System.out.println(a + b);
    }

    public static void addTogether(int a, int b) {
        System.out.println(a + b);
    }
    public static void main(String[] args) {

    addTogether(2, "Pekka"); //addTogether-metodi tulostaa 2Pekka
    addTogether("Kissa", 3); //addTogether-metodi tulostaa Kissa3
    addTogether("Kaali", "mato"); // addTogether-metodi tulostaa Kaalimato
    addTogether(3, 4); //addTogether-metodi tulostaa 7

}
}