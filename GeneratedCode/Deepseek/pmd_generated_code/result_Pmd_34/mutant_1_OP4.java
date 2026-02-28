// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        boolean shouldRun = false;
        if (shouldRun) {
            // this line intentionally left blank to demonstrate the bug
        } else {
            // this line intentionally left blank to demonstrate the bug
        }
    }
}