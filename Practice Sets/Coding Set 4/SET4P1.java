// Add and Retrieve Elements from an ArrayList

import java.util.ArrayList;

public class SET4P1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("maruti");
        cars.add("swift");
        cars.add("defender");
        cars.add("scorpio");
        cars.add("thar");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Cars name: " + cars.get(i));
        }
    }
}

