import java.lang.Thread;

class Foo {
    ClassLoader cl = Thread.currentThread().getContextClassLoader(); // BUG: UseProperClassLoader

    public ClassLoader showBug() {
int mdaygzyq = 0;switch  (mdaygzyq) {case 1:boolean qjdvgtoe = true;break;default:char bcliwndj = 'x';break;}

        return cl;
    
}
}