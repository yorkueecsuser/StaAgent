import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
        while(false) {
            // This is an unreachable loop to be inserted.
        }
        return cl;
    }
}