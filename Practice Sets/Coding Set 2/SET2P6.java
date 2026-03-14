/* Create a class Car with attributes brand and price. Use the this keyword inside the constructor to initialize the variables and display the details. */

class Car {
    String brand;
    double price;

    Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}
public class SET2P6 {
    public static void main(String [] args) {
        Car c1 = new Car("Tesla",4500000.0);

        System.out.println("Brand name: " + c1.brand + "\nCar Price: " + c1.price);
    }
}
