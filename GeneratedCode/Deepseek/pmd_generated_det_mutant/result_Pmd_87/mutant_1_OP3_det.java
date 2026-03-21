import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
if (false && false && true && false && false && true && false && false && false && false && false) {float lwztuqau = -692118805;}

        return cl;
    
}
}