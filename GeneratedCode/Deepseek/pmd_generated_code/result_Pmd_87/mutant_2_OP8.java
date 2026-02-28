import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader
    ClassLoader z = cl; // MUTANT: Renaming

    public ClassLoader showBug() {
        return cl;
    }
}