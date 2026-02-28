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
        // Mutation: Unreachable switch statement
        int mutant = 0;
        switch (mutant) {
            case 0:
            default:
                break;
        }
    }
}