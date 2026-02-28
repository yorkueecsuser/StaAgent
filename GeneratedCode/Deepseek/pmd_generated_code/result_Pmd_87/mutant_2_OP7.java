import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader
    boolean conditionWhile = getCondition();

    public ClassLoader showBug() {
        while (conditionWhile) { // Unreachable while loop mutation operator
            // An empty block of code to maintain the unreachable while loop
        }
        return cl;
    }

    private boolean getCondition() {
        return false; // Non-final variable or an equivalent method call to avoid unreachable statement error
    }
}