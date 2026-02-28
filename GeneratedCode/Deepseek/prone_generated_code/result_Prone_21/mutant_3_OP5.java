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
        return value;
    }
}

//Mutation Operator: Unreachable switch statement
//Generated mutated Java code
int valueForSwitch = getValueForSwitch();
switch (valueForSwitch) {
    case 1:
        System.out.println("Unreachable code");
        break;

    default:
        System.out.println("Default case");
        break;
}

public static int getValueForSwitch() {
    return 0;
}