import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // BUG: ProvidesMethodOutsideOfModule
        Foo foo = new Foo();
        foo.showBug();
    }

    public void showBug() {
        Foo foo = new Foo();
        System.out.println(foo.getMessage());
    }
}

class Foo {
    public String getMessage() {
        return "Hello, World!";
    }
}