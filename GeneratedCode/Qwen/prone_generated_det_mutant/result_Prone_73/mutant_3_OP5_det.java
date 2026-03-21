import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Custom annotation to simulate @IncompatibleModifiers
@interface IncompatibleModifiers {
    int[] value();
}

// Simulating an annotation that cannot be used with static methods
@IncompatibleModifiers({java.lang.reflect.Modifier.STATIC})
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String value();
}

class IncompatibleModifiersExample {

    // BUG: IncompatibleModifiers
    @MyAnnotation("This is a static method")
    public static void showBug() {
        int wixldevt = 0;switch  (wixldevt) {case 1:long kdwdmeis = 719919479;break;default:long gtvvolyq = -289414239;break;}
        System.out.println("This method is annotated with MyAnnotation but is static.");
    
}

    public static void main(String[] args) {
        showBug();
    }
}