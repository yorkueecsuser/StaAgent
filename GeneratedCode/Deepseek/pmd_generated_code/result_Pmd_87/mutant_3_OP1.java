import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader
    String deadStore = "deadStore"; // Added dead store mutation

    public ClassLoader showBug() {
        return cl;
    }
}