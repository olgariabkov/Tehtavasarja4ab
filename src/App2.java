import java.io.FileNotFoundException;
import java.util.Scanner;

public class App2 {


    public static void main(String[] args) throws FileNotFoundException {


        //luodaan uusi Park objekkti nimellä D...
        Park park =  new Park("Dinosaur Park in TUAS");

        //System.out.println(park);

        //luodaan dinosauruksia
        Dinosaur dino1 = new Dinosaur("T-Rex", 12, "Carnivore");
        Dinosaur dino2 = new Dinosaur("Velociraptor", 7, "Carnivore");
        Dinosaur dino3 = new Dinosaur("Triceratops", 15, "Herbivore");



        // read the files for employees and for dinosaurs
        park.readEmployeesFromFile();
        //System.out.println(park);
        park.readDinosaursFromFile();
        //tulostetaan park objekti
        System.out.println(park);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        //toistuu kunnes käyttäjä haluaa poistua
        while (!exit) {
            //näytetään valikko
            displayMenu(park.getName());
            //käyttäjän valinta
            int choice = scanner.nextInt();
            scanner.nextLine();
            //käsitellään käyttäjän valinta
            handleMenuChoice(choice, park, scanner);
        }
    }
//metodi näyttää päävalikon
    public static void displayMenu(String parkName) {
        System.out.println("\n\nWelcome to *** " + parkName + " ***");
        System.out.println("1. Mange Dinosaur");
        System.out.println("2. Mange Park Employees");
        System.out.println("3. Exit");
        System.out.println("Enter your choice: ");
    }
//metodi käsittelee valinnan valikossa
    public static void handleMenuChoice(int choice, Park park, Scanner scanner) {
        switch (choice) {
            case 1:
                manageDinosaurs(park, scanner);
                break;
                case 2:
                    manageEmployees(park, scanner);
                    break;
                    case 3:
                        System.out.println("Exiting...");
                        System.exit(0);
            default:
                System.out.println("Invalid choice");
        }
    }
//metodi käsittelee työntekijöiden hallinnan
    public static void manageEmployees(Park park, Scanner scanner) {
        //tulostetaan kaikki työntekijät
        System.out.println("All park employees: ");
        System.out.println(park.getEmployees());

        System.out.println("a(dd) - r(emove) - u(pdate) - c(ancel)");
        String answer = scanner.nextLine();

        switch (answer.charAt(0)) {
            case 'a':
                //lisätään uusi tt
                Employee e = askEmployeeInfo(scanner);
                park.getEmployees().add(e);
                break;
                case 'r':
                    //poistetaan tt
                    System.out.println("Enter the employee index to remove: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    park.getEmployees().remove(index);
                    break;
                    case 'u':
                        System.out.println("Enter the employee index to update: ");
                        int updateIndex = scanner.nextInt();
                        scanner.nextLine();
                        updateEmployeeInfo(park.getEmployees().get(updateIndex), scanner);
                        break;
                        case 'c':
                            break;
                            default:
                                System.out.println("Invalid choice");
        }
    }

    public static Employee askEmployeeInfo(Scanner scanner) {
        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.println("Enter job title: ");
        String jobTitle = scanner.nextLine();
        System.out.println("Enter years of experience: ");
        int yearsOfExperience = scanner.nextInt();
        scanner.nextLine();
        return new Employee(name, jobTitle, yearsOfExperience);
    }

    public static void updateEmployeeInfo(Employee employee, Scanner scanner) {
        System.out.println("Updating employee: " + employee);
        System.out.println("Enter new job title: ");
        String newJobTitle = scanner.nextLine();
        System.out.println("Enter new years of experience: ");
        int newYearsOfExperience = scanner.nextInt();
        scanner.nextLine();

        employee.setJobTitle(newJobTitle);
        employee.setYearsOfExperience(newYearsOfExperience);

        System.out.println("Employee updated: " + employee);
    }

    public static void manageDinosaurs(Park park, Scanner scanner) {}





    }

