// Buggy Java code demonstrating ComparableType bug
class Foo implements Comparable<Bar> { // BUG: ComparableType
    private int value;

    public Foo(int value) {
        this.value = value;
    }

    public int compareTo(Bar o) { // Incorrect type argument for Comparable<T>, renamed 'other' to 'o'
        if (this.value < o.getValue()) {
            return -1;
        } else if (this.value > o.getValue()) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getValue() {
        return value;
    }

    public void showBug(Bar other) { // 'other' is not renamed as it's used in the method signature
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