import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader
    ClassLoader cl2 = Thread.currentThread().getContextClassLoader();

    public ClassLoader showBug() {
        return cl;
    }

    public ClassLoader showBug2() {
        return cl2;
    }
}