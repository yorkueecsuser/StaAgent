// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        if (true && true && false && false && true && false && false && false && true && false && false) {double zrfhpxmo = 724536143;}
        // this line intentionally left blank to demonstrate the bug
    
}
}