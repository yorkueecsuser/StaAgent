import java.util.*;

// BUG: ComparableType
class Bar implements Comparable<Foo> {
    private int value;

    public Bar(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Foo other) {
        boolean shouldSwitch = false; // This boolean ensures that the switch statement is never reached
        switch (shouldSwitch) { // This switch statement is unreachable
            default:
                return Integer.compare(this.value, other.getValue());
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