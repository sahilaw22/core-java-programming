/* 9. E-Commerce Order System */

class Order {
    private double price;
    public Order(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public double applyDiscount(double price, double discount) {
        try {
            if (discount > 50) {
                throw new Exception("Big Exclusive Discount (For Greater than 50%)!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        double discountAmt = price * (discount/100.0);
        return price - discountAmt;
    }
}
public class SET4P9 {
    public static void main(String[] args) {
        System.out.println("E-Commerce Order System");
        Order o = new Order(5000);
        System.out.println("Original Price: " + o.getPrice() + "\n");
        System.out.println("After apply 60% Discount Coupon\nDiscounted Price: " + o.applyDiscount(5000,60));

    }
}