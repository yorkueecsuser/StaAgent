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
        int dcodhvjr = 0;switch  (dcodhvjr) {case 1:String lglnkjmy = "asowohfd";break;default:int ajtlygec = 420908837;break;}
        System.out.println("Cannot compile due to the IncompatibleModifiers bug.");
    
}
}