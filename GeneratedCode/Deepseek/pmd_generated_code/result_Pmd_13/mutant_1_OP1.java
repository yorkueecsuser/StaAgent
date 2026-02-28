import java.lang.*;

class Foo {
    String foo; // Mutant Code: Adding a dead store variable
    int foo; // Original Code
}

interface Operation {
    int OPERATION = 1; // Mutant Code: Adding a dead store variable
    int OPERATION = 1; // Original Code
}

class Demo {
    public void showBug() {
        Foo f = new Foo();
        String deadStoreVariable = "abcdefgh"; // Mutant Code: Adding a dead store variable
        System.out.println(f.foo);
    }
}