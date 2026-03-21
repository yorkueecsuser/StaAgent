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
    BuggyClass buggy = new BuggyClass();
    int result = buggy.doSomething();
    result = buggy.doSomething();
    return result;
}

    public static void main(String[] args) {
        BuggyExample example = new BuggyExample();
        int result = example.showBug();
        System.out.println("Result: " + result);
    }
}