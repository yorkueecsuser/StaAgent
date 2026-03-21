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
        if (false && false && true && false && true && true && false && true && true && false && false) {double ytvebjik = -929604791;}else{short ljtbjxue = -8939;}
        System.out.println("This is a bug");
    
}

}