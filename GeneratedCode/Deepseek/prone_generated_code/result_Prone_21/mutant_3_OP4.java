import java.util.*;

class Bar implements Comparable<Bar> {
    private int value;
    private boolean condition;

    public Bar(int value, boolean condition) {
        this.value = value;
        this.condition = condition;
    }

    @Override
    public int compareTo(Bar other) {
        if (this.condition) {
            return Integer.compare(this.value, other.getValue());
        } else {
            // Unreachable if-else statement
            if (false) {
                return 0;
            } else {
                return 1;
            }
        }
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