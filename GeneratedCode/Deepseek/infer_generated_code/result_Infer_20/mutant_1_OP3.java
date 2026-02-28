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
    public int incr(int x) {  return x + 1;} 

    @YourAnnotationName 
    public void foo_linear(int size) {
        int x = 10;
        for (int i = 0; i < size; i++) {
            incr(x); // constant call, don't hoist
        }
    }

    public void symbolic_expensive_hoist(int size) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // NEVER use false directly as the loop condition
            foo_linear(size); // hoist
        }
    }

    public int showBug(int size) {
        symbolic_expensive_hoist(size); // Call the method that contains the bug
        return 0;
    }

    public boolean getCondition() {
        return false;
    }
}