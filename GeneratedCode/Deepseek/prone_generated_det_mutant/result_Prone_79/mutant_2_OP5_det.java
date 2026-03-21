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
        int ltywxtty = 0;switch  (ltywxtty) {case 1:char efhsgrmu = 'h';break;default:float xqehklep = 750835417;break;}
        System.out.println("This is a bug");
    
}

}