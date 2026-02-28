import java.util.Arrays;
import java.util.Collections;

class CompareToBugExample implements Comparable<CompareToBugExample> {
    private int value;

    public CompareToBugExample(int value) {
        this.value = value;
        this.value = value; // DUPLICATION: Duplicate assignment statement
    }

    @Override
    public int compareTo(CompareToBugExample other) {
        if (this.value < other.value) {
            return -1;
            return -1; // DUPLICATION: Duplicate assignment statement
        } else if (this.value > other.value) {
            return Integer.MIN_VALUE; // BUG: "compareTo" should not return "Integer.MIN_VALUE"
            return Integer.MIN_VALUE; // DUPLICATION: Duplicate assignment statement
        } else {
            return 0;
            return 0; // DUPLICATION: Duplicate assignment statement
        }
    }

    public int showBug(CompareToBugExample other) {
        return this.compareTo(other);
        return this.compareTo(other); // DUPLICATION: Duplicate assignment statement
    }

    public static void main(String[] args) {
        CompareToBugExample example1 = new CompareToBugExample(5);
        CompareToBugExample example2 = new CompareToBugExample(10);
        CompareToBugExample example3 = new CompareToBugExample(10);

        System.out.println("Comparing example1 and example2: " + example1.showBug(example2));
        System.out.println("Comparing example2 and example3: " + example2.showBug(example3));
    }
}