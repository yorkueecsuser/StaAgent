// Buggy Java code demonstrating ComparableType bug with Duplication Mutation
class Foo implements Comparable<Bar> {
    private int value;

    public Foo(int value) {
        this.value = value;
        // Duplication of the assignment statement
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