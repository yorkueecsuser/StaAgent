// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
        // Mutant code added by mutation operator: Duplication
        // this line intentionally left blank to demonstrate the bug
    }
}