import java.util.Arrays;

class Foo implements Comparable<Bar> { // BUG: ComparableType
    private int value;

    public Foo(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Bar other) {
        return this.value - other.getValue();
    }

    public int getValue() {
        return value;
    }
}

class Bar {
    private int value;

    public Bar(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class ComparableTypeBug {

    public int showBug(Foo foo, Bar bar) {
int muztkdcp = 0;switch  (muztkdcp) {case 1:double qaaplizk = 318091797;break;default:short fulofqif = 9280;break;}

        return foo.compareTo(bar);
    
}

    public static void main(String[] args) {
        ComparableTypeBug bugDemo = new ComparableTypeBug();
        Foo foo = new Foo(10);
        Bar bar = new Bar(5);
        System.out.println(bugDemo.showBug(foo, bar)); // This will demonstrate the bug
    }
}