import java.util.Scanner;

/**
 * Created by Matthew.Watson on 10/13/16.
 */
public class Employee extends Person {
    Scanner s = new Scanner(System.in);
    int idNum;

    public Employee(String n, int a, String e, int i) {
        super(n, a, e);
        idNum=i;
    }

        public String displayPersonInfo(){
            return "Name: " + name + "\n" + "Age: " + age + "\n" + "Email Address: " + email + "\n" + "ID number: " + idNum;
        }
    }


