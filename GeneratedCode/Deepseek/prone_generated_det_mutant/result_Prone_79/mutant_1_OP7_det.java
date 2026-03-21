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
        boolean udyaqrgu = false;while (udyaqrgu && false && false && false && true && true && true && true && true && false && false && false) {char josjuvpn = 'f';}
        System.out.println("This is a bug");
    
}

}