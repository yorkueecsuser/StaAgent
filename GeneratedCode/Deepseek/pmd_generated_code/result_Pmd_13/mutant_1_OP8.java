import java.lang.*;

class Foo {
    int foo;
}

interface Operation {
    int m = 1; // Mutated: Renaming
}

class Demo {
    public void showBug() {
        Foo f = new Foo();
        System.out.println(f.n);
    }
}