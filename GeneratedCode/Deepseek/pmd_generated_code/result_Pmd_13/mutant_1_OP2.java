import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
    int foo; // Duplication Mutation Operator
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
    int OPERATION = 1; // Duplication Mutation Operator
}

class Demo {
    public void showBug() {
        Foo f = new Foo();
        System.out.println(f.foo);
    }
}