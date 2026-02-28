// Buggy Java code demonstrating ComparableType bug with Dead Store mutation
class Foo implements Comparable<Bar> {
    private int value;
    // Mutation: Inserting unused variable declaration
    private int deadStore;

    public Foo(int value) {
        this.value = value;
    }

    public int compareTo(Bar other) {
        if (this.value < other.getValue()) {
            return -1;
        } else if (this.value > other.getValue()) {
            return 1;
        } else {
            // Mutation: Using the dead store variable
            deadStore = 0;
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