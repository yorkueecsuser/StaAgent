import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.PARAMETER // a privacy source should not flow to this parameter
)
public @interface PrivacySink {

    // Introduced an unreachable for loop according to the mutation operator description
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