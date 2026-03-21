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
        for  (int xhjtqoto = 0; xhjtqoto < 0; xhjtqoto++) {short hjtfbkjc = -7317;}
        System.out.println("Cannot compile due to the IncompatibleModifiers bug.");
    
}
}