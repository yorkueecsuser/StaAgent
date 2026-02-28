import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader
    boolean condition = getCondition(); // added mutant

    public ClassLoader showBug() {
        if (condition) { // added mutant
            System.out.println("This code should be unreachable");
        }
        return cl;
    }

    // added method to get condition
    public boolean getCondition() {
        return false;
    }
}