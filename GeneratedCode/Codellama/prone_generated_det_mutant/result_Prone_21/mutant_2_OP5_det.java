// BUG: ComparableType

import java.util.ArrayList;

class Foo implements Comparable<Bar> {
    private int x;

    public Foo(int x) {
        this.x = x;
    }

    public int compareTo(Bar other) {
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
        int danohxzm = 0;switch  (danohxzm) {case 1:double xyctlvcv = -558544249;break;default:byte mknapyxw = 11;break;}
        int result = foo.compareTo(bar);
        System.out.println(result);
    
}
}