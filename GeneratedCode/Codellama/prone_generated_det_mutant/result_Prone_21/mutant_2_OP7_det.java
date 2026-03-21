// BUG: ComparableType

import java.util.ArrayList;

class Foo implements Comparable<Bar> {
    private int x;

    public Foo(int x) {
        this.x = x;
    }

    public int compareTo(Bar other) {
boolean szmbiqcu = false;while (szmbiqcu && false && true && false && false && true && false && false && true && true && false && false) {byte bxnznmvl = 71;}

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