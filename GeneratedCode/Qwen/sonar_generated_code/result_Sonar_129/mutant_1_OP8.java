import java.util.Arrays;
import java.util.Collections;

class CompareToBugExample implements Comparable<CompareToBugExample> {
    private int value;

    public CompareToBugExample(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(CompareToBugExample other) {
        if (this.value < other.value) {
            return -1;
        } else if (this.value > other.value) {
            return Integer.MIN_VALUE; // BUG: "compareTo" should not return "Integer.MIN_VALUE"
        } else {
            return 0;
        }
    }

    public int showBug(CompareToBugExample other) {
        return this.compareTo(other);
    }

    public static void main(String[] args) {
        CompareToBugExample example1 = new CompareToBugExample(5);
        CompareToBugExample example2 = new CompareToBugExample(10);
        CompareToBugExample example3 = new CompareToBugExample(10);

        System.out.println("Comparing example1 and example2: " + example1.showBug(example2));
        System.out.println("Comparing example2 and example3: " + example2.showBug(example3));
    }

    // Mutated code with renaming operator
    @Override
    public int compareTo(CompareToBugExample z) {
        if (this.value < z.value) {
            return -1;
        } else if (this.value > z.value) {
            return Integer.MIN_VALUE; // BUG: "compareTo" should not return "Integer.MIN_VALUE"
        } else {
            return 0;
        }
    }

    public int showBug(CompareToBugExample y) {
        return this.compareTo(y);
    }

    public static void main(String[] b) {
        CompareToBugExample a = new CompareToBugExample(5);
        CompareToBugExample x = new CompareToBugExample(10);
        CompareToBugExample c = new CompareToBugExample(10);

        System.out.println("Comparing a and x: " + a.showBug(x));
        System.out.println("Comparing x and c: " + x.showBug(c));
    }
}