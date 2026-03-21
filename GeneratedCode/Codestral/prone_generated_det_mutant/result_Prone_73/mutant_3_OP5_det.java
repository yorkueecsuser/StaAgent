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
        int ffnmxqqx = 0;switch  (ffnmxqqx) {case 1:byte wtylmxwm = 59;break;default:int hphpofyh = -339647808;break;}
        System.out.println("Cannot compile due to the IncompatibleModifiers bug.");
    
}
}