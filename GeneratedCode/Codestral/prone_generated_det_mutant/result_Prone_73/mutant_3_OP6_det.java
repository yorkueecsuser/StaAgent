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
        for  (int sntuuwua = 0; sntuuwua < 0; sntuuwua++) {float mhngnhna = -710144125;}
        System.out.println("Cannot compile due to the IncompatibleModifiers bug.");
    
}
}