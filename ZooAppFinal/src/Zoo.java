import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/13/16.
 */
public class Zoo {
    IO io = new IO();
    Scanner s = new Scanner(System.in);
    public static ArrayList<Animal> animalList = new ArrayList();
    public static ArrayList<Employee> employeeList= new ArrayList<>();
    public static ArrayList<Visitor> visitorList= new ArrayList<>();
    public static ArrayList<Bird> birdList= new ArrayList<>();
    public static ArrayList<Mammal> mammalList= new ArrayList<>();
    public static ArrayList<Fish> fishList= new ArrayList<>();
    public static ArrayList<Person> peopleList = new ArrayList();

    public void newVisitor(){
        String name, email;
        int age;
        Boolean visitedBefore=false;
        String visitedBeforeAnswer;
        io.clear();
        System.out.println("Would you like to add a new Visitor?");
        String response = s.nextLine();
        while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")){
            System.out.println("Name: ");
            name=s.nextLine();
            System.out.println("Age: ");
            age=s.nextInt();
            s.nextLine(); // cause Eagle said so //
            System.out.println("Email address: ");
            email=s.nextLine();
            System.out.println("Have you visited before? ");
            visitedBeforeAnswer = s.nextLine();
            if(visitedBeforeAnswer.equalsIgnoreCase("y") || visitedBeforeAnswer.equalsIgnoreCase("yes")){
                visitedBefore=true;
            }
            Visitor newPerson = new Visitor(name,age,email,visitedBefore);
            peopleList.add(newPerson);
            visitorList.add(newPerson);
            io.clear();
            System.out.println("You added " + name + " to the Visitor List");
            System.out.println("Would you like to add another visitor?");
            response = s.nextLine();
        }
    }
    public void newEmployee(){
        String name, email;
        int age,idNum;
        io.clear();
        System.out.println("Would you like to add a new Employee?");
        String response = s.nextLine();
        while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")){
            System.out.println("Name: ");
            name=s.nextLine();
            System.out.println("Age: ");
            age=s.nextInt();
            s.nextLine(); // cause Eagle said so //
            System.out.println("Email address: ");
            email=s.nextLine();
            System.out.println("Employee ID: ");
            idNum=s.nextInt();
            s.nextLine();
            Employee newPerson = new Employee(name,age,email,idNum);
            peopleList.add(newPerson);
            employeeList.add(newPerson);
            io.clear();
            System.out.println("You added " + name + " to the Employee List");
            System.out.println("Would you like to add another employee?");
            response = s.nextLine();
        }
    }

    public void newBird() {
        String name, type;
        int age, wingSpan;
        io.clear();
        System.out.println("Would you like to add a new Bird?");
        String response = s.nextLine();
        while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            System.out.println("Name: ");
            name = s.nextLine();
            System.out.println("Age: ");
            age = s.nextInt();
            s.nextLine();
            System.out.println("Wingspan in inches: ");
            wingSpan = s.nextInt();
            s.nextLine();
            type="Bird";
            Bird newAnimal = new Bird(name, age, type, wingSpan);
            animalList.add(newAnimal);
            birdList.add(newAnimal);
            io.clear();
            System.out.println("You added " + name + " to the Bird List");
            System.out.println("Would you like to add another Bird?");
            response = s.nextLine();

        }
    }
    public void newFish(){
        String name, type, water;
        int age;
        io.clear();
        System.out.println("Would you like to add a new Fish?");
        String response = s.nextLine();
        while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            System.out.println("Name: ");
            name = s.nextLine();
            System.out.println("Age: ");
            age = s.nextInt();
            s.nextLine();
            System.out.println("Freshwater or Saltwater?: ");
            water=s.nextLine();
            type="Fish";
            Fish newAnimal = new Fish(name, age, type,water);
            animalList.add(newAnimal);
            fishList.add(newAnimal);
            io.clear();
            System.out.println("You added " + name + " to the Fish List");
            System.out.println("Would you like to add another Fish?");
            response = s.nextLine();

        }
    }

    public void newMammal(){
        String name, type, hibernatesAnswer;
        int age;
        Boolean hibernates=false;
        io.clear();
        System.out.println("Would you like to add a new Mammal?");
        String response = s.nextLine();
        while (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
            System.out.println("Name: ");
            name = s.nextLine();
            System.out.println("Age: ");
            age = s.nextInt();
            s.nextLine();
            type="Mammal";
            System.out.println("Is " + name + " currently hibernating?");
            hibernatesAnswer = s.nextLine();
            if(hibernatesAnswer.equalsIgnoreCase("y") || hibernatesAnswer.equalsIgnoreCase("yes")){
                hibernates=true;
            }
            Mammal newAnimal = new Mammal(name, age, type, hibernates);
            animalList.add(newAnimal);
            mammalList.add(newAnimal);
            io.clear();
            System.out.println("You added " + name + " to the Mammal List");
            System.out.println("Would you like to add another Mammal?");
            response = s.nextLine();

        }
    }
}
