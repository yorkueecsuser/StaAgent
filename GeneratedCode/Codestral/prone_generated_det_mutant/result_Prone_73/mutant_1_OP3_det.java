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
        if (true && false && false && true && true && true && true && false && false && false && false) {char xbhghowv = 'u';}
        System.out.println("Cannot compile due to the IncompatibleModifiers bug.");
    
}
}