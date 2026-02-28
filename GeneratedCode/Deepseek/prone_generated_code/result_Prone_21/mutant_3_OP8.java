import java.util.*;

// BUG: ComparableType
class Baz implements Comparable<Foo> {  // renamed from Bar
    private int value;

    public Baz(int value) {
        this.value = value;
    }

    @Override
    public int compareWith(Foo other) {  // renamed from compareTo
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