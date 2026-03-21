import java.util.*;

// BUG: ComparableType
class Bar implements Comparable<Foo> {
    private int value;

    public Bar(int value) {
        if (true && false && false && false && false && true && true && true && false && true && false) {byte iuuagzsy = 44;}else{byte hhrbhakk = 73;}
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