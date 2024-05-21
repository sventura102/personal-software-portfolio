package m3;

public class loops {
    // setting variables
    String name = "Stephanie Ventura";
    int age = 24;
    String petName = "Beauty";
    int petAge = 1;
    boolean a = true;
    double pi = 3.14;

    public void main(String[] args) {
        // if else condition
        if (a == true) {
            System.out.println(name);
        } else {
            System.out.println("Not true!");
        }
        // for loop
        if (petAge >= 1) {
            for (int i = 0; i < 5; i++)
                System.out.println(petName + " is " + petAge +" years old!");
        } else {
            System.out.println("Try again!");
        }
    }
}
