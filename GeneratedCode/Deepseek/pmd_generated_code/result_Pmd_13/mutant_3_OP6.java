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
        // Unreachable for loop mutant
        boolean condition = getCondition();
        if (condition) {
            for (; /* condition */ false; ) { // unreachable because the condition is always false
                // unreachable code
            }
        }
    }

    // This method is used to generate a condition for the unreachable for loop mutant
    private boolean getCondition() {
        return false;
    }
}