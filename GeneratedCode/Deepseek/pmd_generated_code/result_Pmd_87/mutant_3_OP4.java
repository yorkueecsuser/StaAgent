import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); //BUG: UseProperClassLoader

    public ClassLoader showBug() {
        return cl;
    }

    public void unreachableIfElseStatementMutant() {
        boolean condition = false;
        if (condition) {
            System.out.println("This code will never run");
        } else {
            System.out.println("This is the unreachable code");
        }
    }
}