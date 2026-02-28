import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressFieldNotInitialized {

    // Introduced a method with a variable to demonstrate renaming mutation
    public default void exampleMethod() {
        String originalName = "example";
        String x = originalName; // Renamed 'originalName' to 'x'
        System.out.println(x);
    }
}