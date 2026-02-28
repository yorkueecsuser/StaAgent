import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(
    value = {
      ElementType.METHOD, // method returns something private
      ElementType.PARAMETER, // parameter is private
      ElementType.FIELD, // field is private
    })
public @interface PrivacySource {
    int someField() default 0;
}

class Example {
    private int x;

    public void setX(int value) {
        x = value; // This is the assignment statement we will duplicate
    }
}