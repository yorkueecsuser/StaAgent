import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface GeneratedGraphQL {
    // Introduced a dummy method to include a variable for mutation
    default void dummyMethod() {
        String originalName = "example";
        System.out.println(originalName);
        
        // Mutant: Renamed 'originalName' to 'a'
        String a = "example";
        System.out.println(a);
    }
}