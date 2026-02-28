import java.util.*;

// BUG: ComparableType
class Bar implements Comparable<Foo> {
    private int value;

    public Bar(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Foo other) {
        return Integer.compare(this.value, other.getValue());
    }
}

class Foo {
    private int value;

    public Foo(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class Mutant {
    public boolean getCondition() {
        return false; // mutated line
    }

    public void unreachableIf() {
        if (getCondition()) {
            // unreachable code
            System.out.println("Unreachable if statement");
        }
    }
}