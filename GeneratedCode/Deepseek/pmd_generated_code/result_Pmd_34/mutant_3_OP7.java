// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
    }
    // Unreachable while loop mutation implementation
    {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code that will never be executed
            System.out.println("This code will never be executed");
            break;
        }
    }
}