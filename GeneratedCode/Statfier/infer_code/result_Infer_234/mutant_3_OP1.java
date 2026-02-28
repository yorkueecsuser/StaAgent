import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface IgnoreAllocations {
    // Dead Store mutation: Adding an unused variable declaration
    String qzjfnxrb = "unusedVariable";
}