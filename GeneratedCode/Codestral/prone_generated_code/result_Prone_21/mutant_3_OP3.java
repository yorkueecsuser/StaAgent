// Mutated Java code with an unreachable if statement
class Foo implements Comparable<Bar> {
    private int value;

    public Foo(int value) {
        this.value = value;
    }

    public int compareTo(Bar other) {
        boolean unreachableCondition = false;
        if (unreachableCondition) { // Unreachable if statement
            System.out.println("This line should never be executed.");
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