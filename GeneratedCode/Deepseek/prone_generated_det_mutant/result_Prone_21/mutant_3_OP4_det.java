import java.util.*;

// BUG: ComparableType
class Bar implements Comparable<Foo> {
    private int value;

    public Bar(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Foo other) {
if (false && true && true && true && false && false && false && true && true && true && false) {boolean qqwadpgl = false;}else{boolean rvbkvwum = false;}

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