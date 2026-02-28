import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class UnreachableDemo {
    public boolean getCondition() {
        return false; 
    }

    public void showUnreachableIf() {
        if (getCondition()) {
            System.out.println("This will never run.");
        }
        System.out.println("This will always run.");
    }
}