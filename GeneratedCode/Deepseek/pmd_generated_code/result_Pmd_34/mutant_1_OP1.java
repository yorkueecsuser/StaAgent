// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
        
        // Dead Store Mutation
        int deadStore_12345678;
    }
}