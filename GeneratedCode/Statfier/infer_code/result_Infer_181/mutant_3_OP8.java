import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface NoAllocation {}

class Example {
    public void exampleMethod() {
        int count = 0;
        String message = "Hello";
        
        // Mutant 1: Rename 'count' to 'a'
        int a = 0;
        String message1 = "Hello";
        
        // Mutant 2: Rename'message' to 'b'
        int count1 = 0;
        String b = "Hello";
    }
}