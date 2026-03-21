import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
if (true && false && false && false && false && false && false && true && true && false && false) {double bcwdhkvq = -923131127;}else{byte mndwblhy = 68;}

        return cl;
    
}
}