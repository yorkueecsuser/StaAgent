// BUG: DoNotExtendJavaLangThrowable
class Foo extends Throwable { 
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
    }

    // Mutant code: Unreachable for loop (Incorrect example)
    public void unreachableForLoopIncorrect() {
        for (int i = 0; false; i++) {
            // unreachable code
        }
    }

    // Mutant code: Unreachable for loop (Correct example)
    public void unreachableForLoopCorrect() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // reachable code
        }
    }
}