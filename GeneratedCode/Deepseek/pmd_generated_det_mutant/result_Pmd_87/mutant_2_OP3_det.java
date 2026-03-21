import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
if (true && true && false && false && false && false && true && true && true && true && false) {boolean pbmcfzpx = false;}

        return cl;
    
}
}