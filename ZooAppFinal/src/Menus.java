import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/13/16.
 */
public class Menus {
    Scanner input = new Scanner(System.in);
    Zoo z = new Zoo();
    IO io=new IO();

    public int personMenu() {
        int choice;
        System.out.println("Would you like to add an Employee or Visitor?");
        System.out.println("0. Exit to Main Menu");
        System.out.println("1. Visitor");
        System.out.println("2. Employee");
        System.out.println("3. View List of all People");
        System.out.println("4. View Visitor List");
        System.out.println("5. View Employee List");
        choice = input.nextInt();
        return choice;
    }

    public void addMenu() {
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = personMenu();
            switch (menuItem) {
                case 1:
                    z.newVisitor();
                    break;
                case 2:
                    z.newEmployee();
                    break;
                case 3:io.showPeopleList();
                    break;
                case 4:io.showVisitorList();
                    break;
                case 5:io.showEmployeeList();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose an option.");
            }
        }
    }

    public int animalMenu() {
        int choice;
        System.out.println("What kind of Animal would you like to add?");
        System.out.println("0. Exit to Main Menu");
        System.out.println("1. Mammal");
        System.out.println("2. Fish");
        System.out.println("3. Bird");
        System.out.println("4. View Animal List");
        choice = input.nextInt();
        return choice;
    }
    public void animalValidate() {

        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = animalMenu();
            switch (menuItem) {
                case 1:
                    z.newMammal();
                    break;
                case 2:
                    z.newFish();
                    break;
                case 3:
                    z.newBird();
                    break;
                case 4:io.showAnimalList();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose an option");
            }
        }
    }

    public void menuSwitch() throws IOException {
        String fileName = "Help.txt";
        int menuItem = -1;
        while (menuItem != 0)
        {menuItem = menu();
            switch (menuItem) {
                case 1:
                    addMenu();
                    break;
                case 2:
                    animalValidate();
                    break;
                case 3:
                    viewPeopleMenuSwitch();//view lists, switches people(employee,visitor,both) animals(mammal,bird,fish,all)
                    break;
                case 4:
                    viewAnimalMenuSwitch();
                    break;
                case 5:
                    Desktop.getDesktop().open(new File(fileName));
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose an option.");
            }
        }
    }

    public int menu() {
        int choice;
        io.clear();
        System.out.println("---Zooly---");
        System.out.println("0. Exit the program");
        System.out.println("1. Add a Person");
        System.out.println("2. Add an Animal");
        System.out.println("3. View People List");
        System.out.println("4. View Animal List");
        System.out.println("5. HELP!");
        System.out.println();
        System.out.println("Please Enter a choice: ");
        choice = input.nextInt();
        return choice;
    }
    public void viewPeopleMenuSwitch() {
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = viewPeopleMenu();
            switch (menuItem) {
                case 1:io.showPeopleList();
                    break;
                case 2:io.showVisitorList();
                    break;
                case 3:io.showEmployeeList();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose an option.");
            }
        }
    }
    public int viewPeopleMenu() {
        int choice;
        System.out.println("---Zooly---");
        System.out.println("0. Exit to Main Menu");
        System.out.println("1. View People List");
        System.out.println("2. View Employee List");
        System.out.println("3. View Visitor List");
        System.out.println();
        System.out.println("Please Enter a choice: ");
        choice = input.nextInt();
        return choice;
    }
    public void viewAnimalMenuSwitch() {
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = viewAnimalMenu();
            switch (menuItem) {
                case 1:io.showAnimalList();
                    break;
                case 2:io.showBirdList();
                    break;
                case 3:io.showMammalList();
                    break;
                case 4:io.showFishList();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please choose an option.");
            }
        }
    }
    public int viewAnimalMenu() {
        int choice;
        System.out.println("---Zooly---");
        System.out.println("0. Exit to Main Menu");
        System.out.println("1. View Animal List");
        System.out.println("2. View Bird List");
        System.out.println("3. View Mammal List");
        System.out.println("4. View Fish List");
        System.out.println();
        System.out.println("Please Enter a choice: ");
        choice = input.nextInt();
        return choice;
    }
}