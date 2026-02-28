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
public @interface PrivacySource {}

class ExampleClass {
    private int originalField;

    public ExampleClass(int originalField) {
        this.originalField = originalField;
    }

    @PrivacySource
    private int originalMethod(int originalParameter) {
        return originalField + originalParameter;
    }
}

// Mutant code
class MutantExampleClass {
    private int renamedfield;

    public MutantExampleClass(int renamedfield) {
        this.renamedfield = renamedfield;
    }

    @PrivacySource
    private int renamedmethod(int renamedparameter) {
        return renamedfield + renamedparameter;
    }
}