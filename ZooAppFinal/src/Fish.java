/**
 * Created by Matthew.Watson on 10/13/16.
 */
public class Fish extends Animal{
    String water; //freshwater or saltwater
    String location = Exhibit.FISH.getExhibitNum();
    public Fish(String n, int a, String t, String w) {

        super(n, a, t);
        water=w;
    }

    public String displayAnimalInfo(){

        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Type: " + type + "\n"
                + "Fresh Water or Salt Water: "+ water + "\n" + "Exhibit: " + location + "\n";
    }

}
