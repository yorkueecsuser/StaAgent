import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
        return cl;
    }

    // Unreachable for loop mutation
    public void unreachableForLoop() {
        for (int i = 0; false; i++) {
            // do nothing
        }
    }
}