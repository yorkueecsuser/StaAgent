// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
    }

    // Mutation: Duplication
    public void showBugAgain() {
        // this line intentionally left blank to demonstrate the bug
    }
}