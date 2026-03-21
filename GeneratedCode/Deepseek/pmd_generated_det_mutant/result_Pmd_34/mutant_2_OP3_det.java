// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        if (false && true && false && true && true && false && false && true && false && true && false) {String cblxboyn = "qpqhaziu";}
        // this line intentionally left blank to demonstrate the bug
    
}
}