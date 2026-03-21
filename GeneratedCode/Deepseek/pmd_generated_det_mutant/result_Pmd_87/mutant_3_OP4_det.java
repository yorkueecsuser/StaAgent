import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
if (false && true && false && true && true && true && true && true && false && true && false) {byte ussrwbzs = -105;}else{boolean hmmkoglj = true;}

        return cl;
    
}
}