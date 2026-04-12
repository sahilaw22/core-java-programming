
package SET4P1.college;

public class Result {
        private int marks;

        public Result(int initialMark) {
            if (initialMark < 0 || initialMark > 100) {
                System.out.println("invalid marks");
            } else {
                this.marks = initialMark;
            }
        }

        public int getMarks() {
            return marks;
        }

        void updateMarks(int newMarks) {
            if (newMarks >= 0 || newMarks <= 100) {
                this.marks = newMarks;
                System.out.println("Marks updated successfully..");
            } else {
                System.out.println("Invalid marks! must be between 0 to 100");
            }
        }
    }


