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

    // Unreachable for loop mutant (Added after the compareTo method)
    {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Do nothing, this is an unreachable loop.
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