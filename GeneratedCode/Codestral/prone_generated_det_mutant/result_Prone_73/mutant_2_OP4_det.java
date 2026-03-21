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
        if (true && false && false && true && false && true && false && true && false && true && false) {boolean wcajcwuh = true;}else{int roirdbnj = -767740123;}
        System.out.println("Cannot compile due to the IncompatibleModifiers bug.");
    
}
}