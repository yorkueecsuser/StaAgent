import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
        if (false) {
            System.out.println("This code will never be executed due to boolean condition.");
        }
        return cl;
    }
}