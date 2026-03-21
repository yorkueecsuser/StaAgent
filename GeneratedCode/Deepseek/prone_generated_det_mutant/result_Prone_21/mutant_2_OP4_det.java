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
if (true && false && false && false && true && false && true && true && true && true && false) {long hnjxhumw = 451379388;}else{short vnzzbwwv = 4656;}

        return value;
    
}
}