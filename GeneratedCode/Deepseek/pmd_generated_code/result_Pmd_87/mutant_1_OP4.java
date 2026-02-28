import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader();

    public ClassLoader showBug() {
        if (false) {
            // Unreachable code
            System.out.println("This code will never be executed");
        } else {
            return cl;
        }
        return null; // A return statement is required at the end of each method
    }
}