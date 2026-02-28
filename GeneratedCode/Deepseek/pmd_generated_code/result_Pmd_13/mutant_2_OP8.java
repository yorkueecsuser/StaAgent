import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
    String x; // Mutant: Renaming Operator
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
    String y; // Mutant: Renaming Operator
}

class Demo {
    public void showBug() {
        Foo f = new Foo();
        System.out.println(f.foo);
    }
}