/* Create a class Sentence that stores a sentence (String). Write a method that splits the sentence into words and counts the total number of words. */

class Sentence {
    String sentence;

    Sentence() {
        sentence = null;
    }
    void wordSplitCount(String sentnc) {
        int count = 0;
        String[] words = sentnc.split(" ");
        System.out.println("Sentence is splitted by word");
        for (int i = 0 ; i < words.length; i++) {
                String word = words[i];
                System.out.print(word + " | ");
                count++;
            }
        System.out.println("\nTotal no. of words " + count);

        }
    }

public class SET2P10 {
    public static void main(String [] args) {
        Sentence s = new Sentence();
        s.wordSplitCount("the house of the ocean red");

    }
}
