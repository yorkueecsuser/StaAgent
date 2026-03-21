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
        if (true && true && false && true && true && true && false && true && false && false && false) {double rqniwluj = 466269574;}
        this.value = value;
    
}

    public int getValue() {
        return value;
    }
}