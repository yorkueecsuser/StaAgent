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
        int renvvwlo = 0;switch  (renvvwlo) {case 1:double rfneyrqa = -227003577;break;default:double amnadfea = 338490821;break;}
        this.value = value;
    
}

    public int getValue() {
        return value;
    }
}