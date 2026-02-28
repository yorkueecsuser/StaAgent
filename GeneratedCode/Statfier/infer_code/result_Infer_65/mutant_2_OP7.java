import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({
  ElementType.CONSTRUCTOR,
  ElementType.METHOD,
  ElementType.PACKAGE,
  ElementType.TYPE,
})
public @interface Verify {
    // Adding an unreachable while loop according to the mutation operator
    boolean conditionWhile = getCondition();
    default boolean getCondition() {
        return false;
    }
    
    static void addUnreachableLoop() {
        while (getStaticCondition()) {
            // This loop is unreachable because getStaticCondition() always returns false
        }
    }
    
    static boolean getStaticCondition() {
        return false;
    }
}