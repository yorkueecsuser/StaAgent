// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        duplicatedMethod();
        // this line intentionally left blank to demonstrate the bug
        duplicatedMethod();
    }

    private void duplicatedMethod() {
        // Duplicate of the method
    }
}