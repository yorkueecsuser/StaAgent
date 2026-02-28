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
        int i = 0;
        do {
            incr(x); // constant call, don't hoist // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
            i++;
        } while (i < size);
    }

    public void symbolic_expensive_hoist(int size) {
        int i = 0;
        do {
            foo_linear(size); // hoist
            i++;
        } while (i < size);
    }

    public int showBug(int size) {
        symbolic_expensive_hoist(size); // Call the method that contains the bug
        return 0;
    }
}