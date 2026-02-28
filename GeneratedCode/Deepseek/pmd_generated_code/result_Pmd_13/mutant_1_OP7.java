import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
}

class Demo {
    public void showBug() {
        Foo f = new Foo();
        System.out.println(f.foo);

        // Unreachable While loop
        boolean condition = getCondition();
        while (condition) {
            // do nothing, making loop unreachable
        }
    }

    // This method is used to get the condition for the unreachable while loop
    private boolean getCondition() {
        return false;
    }
}