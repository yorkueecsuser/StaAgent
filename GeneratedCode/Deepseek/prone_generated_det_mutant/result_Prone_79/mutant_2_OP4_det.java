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
        if (true && true && true && true && false && true && false && false && false && true && false) {byte wxkdqqoe = -121;}else{short pavhqatx = -5189;}
        System.out.println("This is a bug");
    
}

}