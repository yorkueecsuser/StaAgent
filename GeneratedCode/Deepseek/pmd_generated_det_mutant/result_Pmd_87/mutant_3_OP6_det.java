import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
for  (int jshaejoh = 0; jshaejoh < 0; jshaejoh++) {char zytryjge = 't';}

        return cl;
    
}
}