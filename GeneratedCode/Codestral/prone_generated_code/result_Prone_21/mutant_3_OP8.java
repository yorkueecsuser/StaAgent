// Buggy Java code demonstrating ComparableType bug
class Foo implements Comparable<Bar> {
    private int value;

    public Foo(int value) {
        this.value = value;
    }

    public int compareTo(Bar other) {
        if (this.value < other.getValue()) {
            return -1;
        } else if (this.value > other.getValue()) {
            return 1;
        } else {
            return 0;
        }
    }

    // Mutant: Renamed variable 'value' to 'v'
    public int getV() {
        return value;
    }

    // Updated the method to use the new variable name
    public void showBug(Bar other) {
        Bar b = other;
        System.out.println("Comparison result: " + compareTo(b));
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