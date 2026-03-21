// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        if (true && false && false && true && true && false && true && false && true && false && false) {byte npnezfxc = 106;}
        // this line intentionally left blank to demonstrate the bug
    
}
}