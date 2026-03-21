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
        boolean eoaszvuu = false;while (eoaszvuu && false && true && true && false && true && true && false && false && true && false && false) {float dtjuunkp = -435520274;}
        System.out.println("This is a bug");
    
}

}