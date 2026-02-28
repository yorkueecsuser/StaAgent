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

// Added the mutant code
class Bar {
    private int renamedValue;

    public Bar(int renamedValue) {
        this.renamedValue = renamedValue;
    }

    @Override
    public int compareTo(Foo other) {
        return Integer.compare(this.renamedValue, other.getValue());
    }
}

class Foo {
    private int renamedValue;

    public Foo(int renamedValue) {
        this.renamedValue = renamedValue;
    }

    public int getValue() {
        return renamedValue;
    }
}