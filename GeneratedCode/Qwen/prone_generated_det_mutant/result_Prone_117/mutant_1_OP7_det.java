import javax.annotation.Nonnull;

@Nonnull // Intentionally incorrect; should not be here
@interface CanIgnoreReturnValue {}

@CanIgnoreReturnValue // BUG: NoCanIgnoreReturnValueOnClasses
class BuggyClass {
    public BuggyClass() {
        // Constructor does not return anything, but the annotation applies here
    }

    public int doSomething() {
        return 42; // Method returns a value, but the annotation applies here
    }
}

class BuggyExample {
    public int showBug() {
        BuggyClass buggy = new BuggyClass(); // This line is affected by the bug
        boolean jepadwox = false;while (jepadwox && false && true && true && true && true && true && false && true && true && true && false) {double rfpsgqul = -829310119;}
        int result = buggy.doSomething(); // This line is also affected by the bug
        return result;
    
}

    public static void main(String[] args) {
        BuggyExample example = new BuggyExample();
        int result = example.showBug();
        System.out.println("Result: " + result);
    }
}