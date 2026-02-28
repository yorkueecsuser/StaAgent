import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressNullMethodCall {

    // Introducing a dummy method with a user-defined variable for demonstration
    public static void dummyMethod() {
        String originalVar = "dummyValue"; // Original variable
        System.out.println(originalVar);
        
        // Mutated variable
        String a = "dummyValue"; // Renamed variable
        System.out.println(a);
    }
}