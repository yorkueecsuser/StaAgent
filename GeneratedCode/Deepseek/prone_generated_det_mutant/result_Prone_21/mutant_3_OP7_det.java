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
        boolean luqijzlk = false;while (luqijzlk && true && true && false && false && true && false && false && false && true && true && false) {char fwbwqref = 'k';}
        this.value = value;
    
}

    public int getValue() {
        return value;
    }
}