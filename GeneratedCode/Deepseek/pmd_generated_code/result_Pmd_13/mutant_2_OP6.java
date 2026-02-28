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
    }

    // Mutation: Unreachable for loop
    public void unreachableForLoop() {
        boolean shouldRun = false;
        for (int i = 0; shouldRun; i++) {
            // Unreachable code
            System.out.println("This unreachable code should never run");
        }
    }
}