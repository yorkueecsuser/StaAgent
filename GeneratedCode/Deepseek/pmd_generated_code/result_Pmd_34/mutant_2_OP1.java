// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        String unusedVariable = "unused";
        // this line intentionally left blank to demonstrate the bug
    }
}