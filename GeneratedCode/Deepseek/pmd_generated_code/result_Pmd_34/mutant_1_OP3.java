// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    private boolean condition = false; // non-final variable used in unreachable if statement

    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
        if (condition) {
            // mutation: condition is set to false and the following block of code will never be executed
        }
    }
}