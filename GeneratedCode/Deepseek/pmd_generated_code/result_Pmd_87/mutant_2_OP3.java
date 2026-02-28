import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader();

    public ClassLoader showBug() {
        return cl;
    }

    public void unreachableIfStatement() {
        boolean condition = false;
        if (condition) {
            // This will never be executed, leading to an unreachable statement error.
            // This mutation is to test if the original code handles unreachable if statements.
            System.out.println("This code is unreachable!!");
        }
    }
}