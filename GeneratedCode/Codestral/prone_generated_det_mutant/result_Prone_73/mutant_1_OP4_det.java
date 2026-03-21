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
        if (true && true && true && false && true && false && false && false && true && true && false) {double edmtrlqp = -78326413;}else{float jpvlaequ = -223495352;}
        System.out.println("Cannot compile due to the IncompatibleModifiers bug.");
    
}
}