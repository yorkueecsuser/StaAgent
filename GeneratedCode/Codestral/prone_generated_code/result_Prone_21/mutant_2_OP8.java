// Buggy Java code demonstrating ComparableType bug
class Foo implements Comparable<Bar> {
    private int value;

    public Foo(int value) {
        this.value = value;
    }

    public int compareTo(Bar o) { // Renamed variable 'other' to 'o'
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