import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({
    ElementType.METHOD, // method returns something private
    ElementType.PARAMETER, // parameter is private
    ElementType.FIELD, // field is private
})
public @interface PrivacySource {}

class ExampleClass {
    @PrivacySource
    private int privateField;

    public void setPrivateField(int value) {
        privateField = value; // Hypothetical assignment statement
    }
}