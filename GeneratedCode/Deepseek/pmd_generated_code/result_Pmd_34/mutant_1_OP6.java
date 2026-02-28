// BUG: Unreachable for loop
class Foo extends Throwable { 
    public void showBug() {
        // this line intentionally left blank to demonstrate the bug
        boolean conditionFor = true;
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop
        }
    }
}