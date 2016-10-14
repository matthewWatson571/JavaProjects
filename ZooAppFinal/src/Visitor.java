/**
 * Created by Matthew.Watson on 10/13/16.
 */
public class Visitor extends Person {
    Boolean visitedBefore;
    public Visitor(String n, int a, String e, Boolean v) {
        super(n, a, e);
      visitedBefore=v;
    }
    public String displayPersonInfo(){
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Email Address: " + email + "\n" + "Visited before: " + visitedBefore;
    }

}
