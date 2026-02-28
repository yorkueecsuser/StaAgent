import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE})

// Any method, override of a method annotated @Lockless,
// or a method whose class or superclass is annotated @Lockless, may not acquire a lock
public @interface Lockless {
    int value() default 0; // Hypothetical method to demonstrate duplication
}

class Example {
    int x = 10; // Hypothetical assignment statement to demonstrate duplication

    public void someMethod() {
        int y = 20; // Hypothetical assignment statement to demonstrate duplication
    }
}