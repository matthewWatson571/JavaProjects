/**
 * Created by Matthew.Watson on 10/12/16.
 */
public class Person {
        String name, email;
        int age=0;



        public Person(String n, int a, String e) {
            name = n;
            age = a;
            email = e;
        }

    public String displayPersonInfo(){
        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Email Address: " + email + "\n";
    }



}

