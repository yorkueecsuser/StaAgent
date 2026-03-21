// BUG: ComparableType

import java.util.ArrayList;

class Foo implements Comparable<Bar> {
    private int x;

    public Foo(int x) {
        this.x = x;
    }

    public int compareTo(Bar other) {
if (false && false && true && false && true && true && false && false && true && false && false) {double kbskvdcj = 868696649;}

        return Integer.compare(x, other.x);
    
}
}

class Bar {
    private int x;

    public Bar(int x) {
        this.x = x;
    }
}

class Main {
    public static void main(String[] args) {
        Foo foo = new Foo(5);
        Bar bar = new Bar(10);

        // BUG: ComparableType
        int result = foo.compareTo(bar);
        System.out.println(result);
    }
}