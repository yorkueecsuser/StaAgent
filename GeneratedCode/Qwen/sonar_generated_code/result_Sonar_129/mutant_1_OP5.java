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

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                System.out.println("Default case of unreachable switch.");
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, making the switch statement unreachable
        return false;
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
}