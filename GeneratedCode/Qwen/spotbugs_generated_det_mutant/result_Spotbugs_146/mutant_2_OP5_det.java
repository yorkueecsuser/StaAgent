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
        int jjswfzgb = 0;switch  (jjswfzgb) {case 1:short zmlrysff = -2310;break;default:long pxqacjzq = 268989555;break;}
        // The sensitive data is used in a way that does not respect the @Sensitive annotation
        return sensitiveData.toLowerCase(); // BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
    
}
}