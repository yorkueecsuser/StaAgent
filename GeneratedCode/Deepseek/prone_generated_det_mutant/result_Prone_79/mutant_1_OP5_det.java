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
        int mpbbliin = 0;switch  (mpbbliin) {case 1:byte pegmgiiv = 99;break;default:char bwakqwug = 'l';break;}
        System.out.println("This is a bug");
    
}

}