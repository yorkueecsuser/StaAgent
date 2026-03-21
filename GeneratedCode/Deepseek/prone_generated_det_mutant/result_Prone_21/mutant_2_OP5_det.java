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
int sguixwwl = 0;switch  (sguixwwl) {case 1:char mxznzzhv = 'y';break;default:short ewvwztql = 4319;break;}

        return value;
    
}
}