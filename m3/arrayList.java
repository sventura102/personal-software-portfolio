package m3;
import java.util.ArrayList;

public class arrayList {
    // determine types of cats to go into our lists of cats!
    String cat1 = "Persian";
    String cat2 = "Siamese";
    String cat3 = "Sphynx";
    String cat4 = "Bengal";
    String cat5 = "Russian Blue";

    public void main(String[] args) {
        //create Array List
        ArrayList<String> cats = new ArrayList<String>();

        //add the cats to the cat list!
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        // add a cat thats not already there
        cats.add("Burmese");

        //Print list of cats
        System.out.println(cats);

        // loop through the cats? yes.
        for(String i : cats) {
            System.out.println(i);
        }

        //Get one cat, you can't take them all :(
        System.out.println("I choose a " + cats.get(1) + "!!!");
    }
}
