import java.util.Random;

// Buggy Java code demonstrating ComparableType bug with Dead Store mutation
class Foo implements Comparable<Bar> { // BUG: ComparableType
    private int value;
    private int deadStoreVariable; // Dead Store mutation: Unused variable declaration

    public Foo(int value) {
        this.value = value;
        initializeDeadStoreVariable(); // Call to initialize the dead store variable
    }

    private void initializeDeadStoreVariable() {
        Random rand = new Random();
        this.deadStoreVariable = rand.nextInt(50); // Assigning a random value to the dead store variable
    }

    public int compareTo(Bar other) { // Incorrect type argument for Comparable<T>
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