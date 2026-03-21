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
        if (true && false && true && true && false && false && true && false && false && true && false) {boolean ecjokgqq = false;}
        System.out.println("This is a bug");
    
}

}