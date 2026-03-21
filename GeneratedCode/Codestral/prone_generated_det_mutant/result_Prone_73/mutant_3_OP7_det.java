import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface CustomAnnotation {
}

@CustomAnnotation // BUG: IncompatibleModifiers
final class FinalClass {
}

class BugExample {
    public static void showBug() {
        boolean kapvxfcb = false;while (kapvxfcb && false && true && false && false && true && false && false && true && true && true && false) {double xydeboug = 576196112;}
        System.out.println("Cannot compile due to the IncompatibleModifiers bug.");
    
}
}