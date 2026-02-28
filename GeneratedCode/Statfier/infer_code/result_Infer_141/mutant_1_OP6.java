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

    // Introduced an unreachable for loop according to the mutation operator
    boolean getCondition() {
        return false;
    }

    default void introduceUnreachableLoop() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
            System.out.println("This is an unreachable loop iteration.");
        }
    }
}