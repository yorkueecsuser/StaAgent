import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
int smwkugch = 0;switch  (smwkugch) {case 1:char aycrdhku = 'l';break;default:boolean biaspcej = true;break;}

        return cl;
    
}
}