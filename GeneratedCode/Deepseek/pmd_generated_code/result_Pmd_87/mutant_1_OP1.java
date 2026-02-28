import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader
    String deadStore_1234abcd; // Dead Store Mutation

    public ClassLoader showBug() {
        deadStore_1234abcd = "Dead Store"; // Dead Store Mutation
        return cl;
    }
}