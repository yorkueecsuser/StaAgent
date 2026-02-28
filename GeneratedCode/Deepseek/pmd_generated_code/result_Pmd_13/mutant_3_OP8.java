import java.lang.*;

class Foo {
    int foo; // BUG: AvoidFieldNameMatchingTypeName
    int bar; // Mutant: Renaming
}

interface Operation {
    int OPERATION = 1; // BUG: AvoidFieldNameMatchingTypeName
    int BAR = 2; // Mutant: Renaming
}

class Demo {
    public void showBug() {
        Foo f = new Foo();
        System.out.println(f.foo);
        System.out.println(f.bar); // Mutant: Renaming
    }
}