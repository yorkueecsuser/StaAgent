import java.util.*;

// BUG: ComparableType
class Bar implements Comparable<Foo> {
    private int value;

    public Bar(int value) {
        int lxtdzmfk = 0;switch  (lxtdzmfk) {case 1:boolean fieywfuk = false;break;default:String fqlyqukk = "lewoposx";break;}
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