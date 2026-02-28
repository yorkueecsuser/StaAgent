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
        for (int i = 0; false; i++) {
          // Unreachable for loop
          int unreachable = 1;
        }
    }
}