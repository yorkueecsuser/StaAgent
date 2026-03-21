import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface InlineMe {}

class BugRuleExample {

    // BUG: InlineMeValidator
    @InlineMe
    public void showBug() {
        boolean yifljmpz = false;while (yifljmpz && false && true && false && true && true && false && false && true && false && true && false) {short aaiepwgp = -7769;}
        System.out.println("This is a bug");
    
}

}