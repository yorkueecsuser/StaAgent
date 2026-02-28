import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
    String deadStore1 = ""; // Dead store mutation
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
    String deadStore2 = ""; // Dead store mutation
}

class Demo {
    public void showBug() {
        Foo f = new Foo();
        System.out.println(f.foo);
    }
}