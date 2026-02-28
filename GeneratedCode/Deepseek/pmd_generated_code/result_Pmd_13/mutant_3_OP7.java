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

        // Mutation: Unreachable while loop
        boolean condition = getCondition();
        while (condition) {
            System.out.println("Unreachable while loop");
        }
    }
    
    // Helper method to get condition
    private boolean getCondition() {
        return false;
    }
}