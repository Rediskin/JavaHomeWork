package HomeWork;

/**
 * Created by user on 29.11.2016.
 */
public class Home2 {
    public static class Dog {


        public String name;
        public String says;

    }
        public static void main(String[] args) {
            Dog dog1 = new Dog();
            dog1.name = "spot";
            dog1.says = "Ruff!";

            Dog dog2 = new Dog();
            dog2.name = "scruffy";
            dog2.says = "Wurf!";
            System.out.println(dog1.name + " says: " + dog1.says);
            System.out.println(dog2.name + " says: " + dog2.says);
        }
    }

