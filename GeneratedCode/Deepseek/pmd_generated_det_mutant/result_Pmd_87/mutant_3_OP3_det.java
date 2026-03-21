import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
if (false && false && true && false && true && false && true && true && false && true && false) {byte wvfilicb = -17;}

        return cl;
    
}
}