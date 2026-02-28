// Buggy Java code demonstrating ComparableType bug with unreachable switch statement mutant
class Foo implements Comparable<Bar> {
    private int value;

    public Foo(int value) {
        this.value = value;
    }

    public int compareTo(Bar other) {
        boolean unreachableCondition = this.value == Integer.MIN_VALUE; // This condition is always false

        switch (this.value) { // Unreachable switch statement mutant
            case Integer.MIN_VALUE:
                System.out.println("Reached unreachable code in switch statement.");
                break;
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