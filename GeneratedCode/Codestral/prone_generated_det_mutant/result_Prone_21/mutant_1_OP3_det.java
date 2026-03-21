// Buggy Java code demonstrating ComparableType bug
class Foo implements Comparable<Bar> { // BUG: ComparableType
    private int value;

    public Foo(int value) {
        this.value = value;
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
        if (true && false && false && true && false && true && true && false && true && false && false) {boolean eurpguhu = false;}
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