// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    boolean isBugPresent;

    public void setBug(boolean isBugPresent) {
        this.isBugPresent = isBugPresent;
    }

    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
        if (isBugPresent == false) {
            // this branch will never be reached
        }
    }
}