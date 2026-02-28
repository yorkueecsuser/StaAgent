import java.util.*;

class Bar implements Comparable<Foo> {
    private int value;

    public Bar(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Foo other) {
        boolean shouldRun = false;
        if (shouldRun) {
            return Integer.compare(this.value, other.getValue());
        } else {
            return 0;
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