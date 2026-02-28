import java.util.*;

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
        return value;
    }
}

class UnreachableForLoop {
    private boolean conditionFor;

    public UnreachableForLoop() {
        conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This code is unreachable due to the condition in the for loop being always false.");
        }
    }
}