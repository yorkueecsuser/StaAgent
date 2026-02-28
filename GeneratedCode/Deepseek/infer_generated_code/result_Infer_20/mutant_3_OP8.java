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
        int x_renamed = 10; 
        for (int i = 0; i < size; i++) {
            incr(x_renamed); 
        }
    }

    public void symbolic_expensive_hoist(int size) {
        for (int i = 0; i < size; i++) {
            foo_linear(size); 
        }
    }

    public int showBug(int size) {
        symbolic_expensive_hoist(size); 
        return 0;
    }
}