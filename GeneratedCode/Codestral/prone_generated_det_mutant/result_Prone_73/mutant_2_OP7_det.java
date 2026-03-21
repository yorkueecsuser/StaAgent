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
        boolean oxdukcdc = false;while (oxdukcdc && false && false && true && false && true && true && false && true && true && true && false) {char jdfjdyet = 'h';}
        System.out.println("Cannot compile due to the IncompatibleModifiers bug.");
    
}
}