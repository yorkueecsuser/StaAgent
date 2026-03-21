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
        for  (int nndqlnxn = 0; nndqlnxn < 0; nndqlnxn++) {String xjomjfbx = "dezpovhi";}
        this.value = value;
    
}

    public int getValue() {
        return value;
    }
}