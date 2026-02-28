import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public boolean getCondition() {
        return false;
    }
    
    public int getValue() {
        return 0;
    }
    
    public void showBug() {
        Foo f = new Foo();
        System.out.println(f.foo);
        boolean condition = getCondition(); // Adding a non-final variable
        if (condition) {
            System.out.println("Condition is true");
        }
        while (getCondition()) { // Adding a non-final variable
            System.out.println("This loop is not reachable");
        }
        for (int i = 0; getCondition(); i++) { // Adding a non-final variable
            System.out.println("This loop is not reachable");
        }
        boolean shouldRun = getCondition(); // Adding a non-final variable
        if (shouldRun) {
            System.out.println("This code is reachable");
        } else {
            System.out.println("This code is not reachable");
        }
        int value = getValue(); // Adding a non-final variable
        switch(value) {
            case 1: // Adding a non-final variable
                System.out.println("This switch statement is not reachable");
                break;
        }
    }
}