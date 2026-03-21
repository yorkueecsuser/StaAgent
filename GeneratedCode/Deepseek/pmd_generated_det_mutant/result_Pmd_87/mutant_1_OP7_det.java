import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
boolean bmetidjg = false;while (bmetidjg && false && false && true && true && true && false && false && true && true && false && false) {byte djubzxxh = 13;}

        return cl;
    
}
}