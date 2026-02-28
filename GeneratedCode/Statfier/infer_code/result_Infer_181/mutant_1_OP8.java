import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface NoAllocation {

    // Adding a dummy method with a user-defined variable for demonstration
    public static void dummyMethod() {
        int originalVariable = 10; // Original variable
        System.out.println(originalVariable);
        
        // Mutated variable
        int b = 10; // Renamed variable
        System.out.println(b);
    }
}