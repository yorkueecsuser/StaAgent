import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
if (true && true && false && true && false && true && false && true && false && true && false) {float wkrnlbuq = 201497205;}else{byte wmgcvxto = 20;}

        return cl;
    
}
}