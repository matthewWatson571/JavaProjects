/**
 * Created by Matthew.Watson on 10/12/16.
 */
public class Animal {
    String name, type;
    int age;
    //Mammal,Bird,Fish

    public Animal(String n, int a, String t) {
        name = n;
        age = a;
        type = t;
    }

    public String displayAnimalInfo() {

        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Type: " + type + "\n";
    }
}

