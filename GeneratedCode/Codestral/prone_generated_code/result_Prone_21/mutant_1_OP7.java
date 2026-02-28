// Buggy Java code demonstrating ComparableType bug with an added unreachable while loop mutant
class Foo implements Comparable<Bar> { // BUG: ComparableType
    private int value;

    public Foo(int value) {
        this.value = value;
    }

    public int compareTo(Bar other) { // Incorrect type argument for Comparable<T>
        // Unreachable while loop mutant inserted below
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute
            System.out.println("Unreachable code executed");
        }

        if (this.value < other.getValue()) {
            return -1;
        } else if (this.value > other.getValue()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getValue() {
        return value;
    }

    public void showBug(Bar other) {
        System.out.println("Comparison result: " + compareTo(other));
    }

    // Method to return false for the unreachable while loop condition
    private boolean getCondition() {
        return false;
    }
}

class Bar {
    private int value;

    public Bar(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}