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
        int fcgcxtdz = 0;switch  (fcgcxtdz) {case 1:short ywqzwtwa = -4232;break;default:boolean rufqptbs = true;break;}
        System.out.println("Cannot compile due to the IncompatibleModifiers bug.");
    
}
}