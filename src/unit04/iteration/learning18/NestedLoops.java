package unit04.iteration.learning18;
//nested loop example
public class NestedLoops {
    public static void main(String[] args) {
        for (int outer = 0; outer < 3; outer++) {
            for (int inner = 0; inner < 3; inner++) {
                System.out.print("outer: " + outer + "\tinner: " + inner + " || ");
            }
            System.out.println();
        }
    }
}
