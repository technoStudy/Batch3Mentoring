package ArrayLists;

import java.util.ArrayList;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        // Create an ArrayList of Strings, say countries
        ArrayList<String> countries = new ArrayList<>();
        System.out.println(countries);
        System.out.println("--------------------------");
        // add at least five county names to the countries and print them on the console
        countries.add("USA");
        countries.add("Germany");
        countries.add("France");
        countries.add("Russia");
        countries.add("Turkey");
        System.out.println(countries);
        System.out.println("----------------------------------");

        // add two more country names to the countries and print the fourth country name on the console
        countries.add("Mexico");
        countries.add("Brazil");
        System.out.println(countries);
        System.out.println("Fourth country is " + countries.get(3));
        System.out.println("-------------------------");
        // change first and third county names to another country names
        countries.set(0, "Spain");
        countries.set(2, "Greece");
        System.out.println(countries);
        System.out.println("-----------------------");
        // remove any two of the country names and print the number of items of the final ArrayList.
        countries.remove("Germany");
        countries.remove(5);
        System.out.println(countries);
        System.out.println("Final length of countries is " + countries.size());
    }
}
