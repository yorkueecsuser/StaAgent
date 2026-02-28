import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader
    String deadStoreVariable = "deadstore"; // Mutation: Dead Store

    public ClassLoader showBug() {
        return cl;
    }
}