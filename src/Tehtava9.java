public class Tehtava9 {
    public static void main(String[] args) {

        //luodaan pankkitili
        BankAccount eAccount = new BankAccount("12376534", 500);

        //tulostetaan tilin tiedot
        System.out.println(eAccount);

        //talletaan rahaa
        eAccount.deposit(100);
        System.out.println("Current Balance: " + eAccount.getBalance());

        //yritetään nostaa rahaa
        eAccount.withdraw(100);
        System.out.println("Current Balance: " + eAccount.getBalance());

        //nostetaan liikaa rahaa
        eAccount.deposit(1000);
        System.out.println("Current Balance: " + eAccount.getBalance());

        //asetetaan uusi tilinumero
        eAccount.setAccountNumber("087654325");
        System.out.println("New account number: " + eAccount.getAccountNumber());

        //yritetään tallettaa -summa
        eAccount.deposit(-200);

        //tulostetaan tilin lopulliset tiedot
        System.out.println(eAccount);
    }
}
