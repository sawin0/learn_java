package unit4;

import java.util.ArrayList;

public class LoopExample {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Kathmandu");
        cities.add("Bhaktapur");
        cities.add("Pokhara");
        cities.add("Lalitpur");

        // for (int i = 0; i < cities.size(); i++) {
        //     System.out.println(cities.get(i));
        // }

        cities.forEach(city -> System.out.println(city));
    }
}
