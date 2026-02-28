import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
        return cl;
    }

    public void insertUnreachableCode() {
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            System.out.println("This statement is unreachable");
        } 
        else {
            System.out.println("This statement is reachable");
        }
    }
}