import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
        return cl;
    }
}

class FooMutant {
    ClassLoader cl = Thread.currentThread().getContextClassLoader();
    boolean conditionWhile = getCondition();

    public ClassLoader showBug() {
        return cl;
    }

    public boolean getCondition() {
        return false;
    }

    public void unreachableWhileLoop() {
        while (conditionWhile) {
            // unreachable code
        }
    }
}