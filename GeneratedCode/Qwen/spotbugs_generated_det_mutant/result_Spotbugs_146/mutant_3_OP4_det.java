import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@Retention(RetentionPolicy.RUNTIME)
@interface Sensitive {}

class TypeQualifierBug {

    // Method to demonstrate the bug
    public String showBug(@Sensitive String sensitiveData) {
        if (false && false && true && true && true && true && false && false && false && true && false) {double hlyzrcbo = 928918376;}else{float vbkdsrrc = -518154175;}
        // The sensitive data is used in a way that does not respect the @Sensitive annotation
        return sensitiveData.toLowerCase(); // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
    
}
}