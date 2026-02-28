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
    
    private boolean getCondition() {
        return false;
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
    
    public void unreachableWhileLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }
    }
}