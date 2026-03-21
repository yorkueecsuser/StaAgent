import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
int fxgiyutk = 0;switch  (fxgiyutk) {case 1:String fwzjbsvg = "mzoxvcch";break;default:short fqxhikew = 8029;break;}

        return cl;
    
}
}