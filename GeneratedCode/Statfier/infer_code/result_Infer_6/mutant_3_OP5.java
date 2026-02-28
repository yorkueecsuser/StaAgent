import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressReturnOverAnnotated {

    // Adding an unreachable switch statement
    public static void main(String[] args) {
        boolean alwaysFalse = getCondition();
        switch (alwaysFalse) {
            case true:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("This will also never be printed");
                break;
        }
    }

    private static boolean getCondition() {
        return false;
    }
}