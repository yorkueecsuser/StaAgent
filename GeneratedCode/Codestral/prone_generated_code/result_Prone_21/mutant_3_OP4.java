class Foo implements Comparable<Bar> {
    private int value;

    public Foo(int value) {
        this.value = value;
    }

    public int compareTo(Bar other) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable mutant branch
            throw new RuntimeException("Unreachable code executed");
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

    // Method to return an unreachable condition
    private boolean getUnreachableCondition() {
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