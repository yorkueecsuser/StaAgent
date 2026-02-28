import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.TYPE,
    ElementType.METHOD,
    ElementType.FIELD,
    ElementType.CONSTRUCTOR,
    ElementType.PARAMETER
})
@interface YourAnnotationName {}

class BuggyCode {
    public int incr(int x) {  return x + 1;} // incr will not be hoisted since it is cheap(constant time)

    @YourAnnotationName // Custom annotation to demonstrate the bug
    public void foo_linear(int size) {
        int x = 10;
        for (int i = 0; i < size; i++) {
            if (false) { // Non-reacable if-else branch to avoid unreachable statement error
                incr(x);
            }
        }
    }

    public void symbolic_expensive_hoist(int size) {
        for (int i = 0; i < size; i++) {
            foo_linear(size); // hoist
        }
    }

    public int showBug(int size) {
        symbolic_expensive_hoist(size); // Call the method that contains the bug
        return 0;
    }
}