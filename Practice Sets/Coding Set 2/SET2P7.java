/* Create a class Message that stores a string. Write methods to display the length of the string and its uppercase form. */

import java.util.*;

class Message {
    String msg;

    Message() {
        msg = null;
    }
    void lengthStrUP(String s) {
        System.out.println("Length of Message is " + s.length() + "\nMessage: " + s.toUpperCase());
    }

}
public class SET2P7 {
    public static void main(String [] args) {
        Message m = new Message();
        m.lengthStrUP("wake up to reality");

    }
}
