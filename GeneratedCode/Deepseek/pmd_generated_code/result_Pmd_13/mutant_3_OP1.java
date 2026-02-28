import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
    String randomString = "xyz12345"; // MUTANT: Adding a dead store
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
    String randomString = "xyz12345"; // MUTANT: Adding a dead store
}

class Demo {
    public void showBug() {
        Foo f = new Foo();
        System.out.println(f.foo);
        System.out.println(Operation.OPERATION); // MUTANT: Adding a dead store
    }
}