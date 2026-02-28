import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); 

    public ClassLoader showBug() {
        return cl;
    }

    public int mutantMethod() {
        boolean condition = false;
        if (!condition) {
            return 1;
        }
        return 0;
    }
}