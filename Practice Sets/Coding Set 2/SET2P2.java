/* Create a class Rectangle with length and width. Use a parameterized constructor to initialize the values and write a method to calculate and display the area. */

class Rectangle{
    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;

    }
        void CalculateArea() {
            System.out.println("Area of rectangle is " + (length*width));
        }
}
public class SET2P2 {
    public static void main(String [] args) {
        Rectangle a = new Rectangle(12,24);
        a.CalculateArea();
    }
}

