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
        if (false && false && true && false && true && false && true && true && true && false && false) {double ickynhno = 756208604;}else{char nhxvcnpc = 'q';}
        System.out.println("This is a bug");
    
}

}