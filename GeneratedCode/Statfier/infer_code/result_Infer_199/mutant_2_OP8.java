import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})

// Any method, override of a method annotated @Lockless,
// or a method whose class or superclass is annotated @Lockless, may not acquire a lock
public @interface Lockless {

    // Introducing a dummy method to demonstrate renaming mutation
    default void dummyMethod() {
        String originalVariable = "This is a test";
        // Renamed variable
        String b = originalVariable;
        System.out.println(b);
    }
}