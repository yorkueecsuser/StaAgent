import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    // unreachable for loop mutation operator
    boolean condition = false;
    for (int i = 0; condition; i++) {
        System.out.println("This is an unreachable for loop");
    }

    public ClassLoader showBug() {
        return cl;
    }
}