// BUG: Unreachable for loop
class Foo extends Throwable { 
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // unreachable code
        }
    }

    private boolean getCondition() {
        // this method will always return false
        return false;
    }
}