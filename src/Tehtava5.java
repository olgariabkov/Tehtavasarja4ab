public class Tehtava5 {
    public static void main(String[] args) {

        //tulostetaan viikon aikataulu
        printWeekSchedule();
    }
    public static void printWeekSchedule() {
        System.out.println("Viikon aikataulu: ");

        //käydään läpi jokainen viikonpäivä ja tulostetaan tiedot
        for (WorkDay day : WorkDay.values()) {
            System.out.println(day.name() + ": Työajat: " + day.getHoursOfWork() + ", Sijainti: " + day.getWorkLocation());
        }
    }
}
