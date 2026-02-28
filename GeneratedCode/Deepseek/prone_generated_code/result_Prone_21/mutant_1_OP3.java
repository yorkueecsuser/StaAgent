import java.util.*;

// MUTANT: Unreachable if statement
class Bar implements Comparable<Foo> {
    private int value;
    private boolean unreachableCondition;

    public Bar(int value) {
        this.value = value;
        this.unreachableCondition = false;
    }

    @Override
    public int compareTo(Foo other) {
        if (unreachableCondition) {
            System.out.println("This will never be executed");
        }
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