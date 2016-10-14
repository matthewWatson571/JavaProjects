import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/12/16.
 */

public class IO{
Scanner s = new Scanner(System.in);
    public void showAnimalList(){
        if(Zoo.animalList.isEmpty()){
            clear();
            System.out.println("There are no animals listed \n");
        }
        for (int i = 0; i<Zoo.animalList.size(); ++i) {
            System.out.println(Zoo.animalList.get(i).displayAnimalInfo()+"\n");
     }
 }
    public void showPeopleList(){
        if(Zoo.peopleList.isEmpty()) {
            clear();
            System.out.println("There are no people listed \n");
        }
        for (int i = 0; i<Zoo.peopleList.size(); ++i) {
            System.out.println(Zoo.peopleList.get(i).displayPersonInfo()+"\n");
            }
        }

    public void showEmployeeList(){
        if(Zoo.employeeList.isEmpty()) {
            clear();
            System.out.println("There are no employees listed \n");
        }
        for (int i = 0; i<Zoo.employeeList.size(); ++i) {
            System.out.println(Zoo.employeeList.get(i).displayPersonInfo()+"\n");
        }
    }

    public void showVisitorList(){
        if(Zoo.visitorList.isEmpty()) {
            clear();
            System.out.println("There are no visitors listed \n");
        }
        for (int i = 0; i<Zoo.visitorList.size(); ++i) {
            System.out.println(Zoo.visitorList.get(i).displayPersonInfo()+"\n");
        }
    }
    public void showBirdList(){
        if(Zoo.birdList.isEmpty()) {
            clear();
            System.out.println("There are no birds listed \n");
        }
        for (int i = 0; i<Zoo.birdList.size(); ++i) {
            System.out.println(Zoo.birdList.get(i).displayAnimalInfo()+"\n");
        }
    }
    public void showMammalList(){
        if(Zoo.mammalList.isEmpty()) {
            clear();
            System.out.println("There are no mammals listed \n");
        }
        for (int i = 0; i<Zoo.mammalList.size(); ++i) {
            System.out.println(Zoo.mammalList.get(i).displayAnimalInfo()+"\n");
        }
    }
    public void showFishList(){
        if(Zoo.fishList.isEmpty()) {
            clear();
            System.out.println("There are no fish listed \n");
        }
        for (int i = 0; i<Zoo.fishList.size(); ++i) {
            System.out.println(Zoo.fishList.get(i).displayAnimalInfo()+"\n");
        }
    }
    public void clear(){
        for (int i = 0; i < 50; ++i)
            System.out.println("\n"); //If Terminal can do it, then I can do it.
    }

}

