import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
boolean abufmocm = false;while (abufmocm && true && true && true && true && false && false && false && false && false && false && false) {byte ylufmnxb = -67;}

        return cl;
    
}
}