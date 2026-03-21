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
        int tfmetglx = 0;switch  (tfmetglx) {case 1:boolean slhyxwkv = false;break;default:byte mtdrwimb = 127;break;}
        System.out.println("This is a bug");
    
}

}