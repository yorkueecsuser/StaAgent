import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
boolean rgznhqff = false;while (rgznhqff && true && false && true && true && true && false && true && false && true && false && false) {String eojglrtg = "srghjitg";}

        return cl;
    
}
}