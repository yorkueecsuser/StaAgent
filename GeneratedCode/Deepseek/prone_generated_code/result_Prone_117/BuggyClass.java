import com.google.errorprone.annotations.CanIgnoreReturnValue;

@CanIgnoreReturnValue
class BuggyClass {
    // BUG: NoCanIgnoreReturnValueOnClasses
    public BuggyClass() {
    }

    // BUG: NoCanIgnoreReturnValueOnClasses
    public void showBug() {
        System.out.println("This is a bug in the NoCanIgnoreReturnValueOnClasses rule");
    }
}