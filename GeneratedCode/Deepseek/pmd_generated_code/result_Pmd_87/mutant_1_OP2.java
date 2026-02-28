import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader
    ClassLoader clCopy = Thread.currentThread().getContextClassLoader(); // Mutant code

    public ClassLoader showBug() {
        return cl;
    }

    public ClassLoader showMutant() { // New method to return the mutant code
        return clCopy;
    }
}