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
        if (false) {
            System.out.println("This statement is unreachable due to the false condition in the if statement.");
        }
    }
}