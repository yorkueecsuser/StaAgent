import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
for  (int ufpnjfqm = 0; ufpnjfqm < 0; ufpnjfqm++) {long zllmaagn = 317639515;}

        return cl;
    
}
}