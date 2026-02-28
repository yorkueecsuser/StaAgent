import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SuppressParameterNotNullable {

    // Method to provide a dynamic condition for the switch statement
    private static boolean getDynamicCondition() {
        return false; // This will always return false, making the switch statement unreachable
    }

    // Example usage of the dynamic condition in a switch statement
    public static void exampleMethod() {
        boolean condition = getDynamicCondition();
        switch (condition) {
            case true:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("This will also never be printed");
                break;
        }
    }
}