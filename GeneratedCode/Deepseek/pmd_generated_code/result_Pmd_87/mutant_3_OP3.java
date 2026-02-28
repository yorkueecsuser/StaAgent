import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
        boolean condition = false;
        if (condition) {
            // Some unreachable code
        }
        return cl;
    }
}