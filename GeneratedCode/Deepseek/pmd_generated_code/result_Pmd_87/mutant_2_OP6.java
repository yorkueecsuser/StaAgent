import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
        return cl;
    }

    // Mutant Code
    public boolean getConditionForLoop() {
        return false;
    }

    public void mutantMethod() {
        boolean conditionFor = getConditionForLoop();
        for (int i = 0; conditionFor; i++) {
            // Do nothing in for loop to make it unreachable
        }
    }
}