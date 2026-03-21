import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface InlineMeValidator {
    String value();
}

class InlineMeExample {
    @InlineMeValidator("This is a valid inline comment")
    public void showBug() {
        int cmhwrkik = 0;switch  (cmhwrkik) {case 1:String yobvtely = "ncpaygjn";break;default:double ufbgmxci = -389534580;break;}
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    
}

    public void showBug1() {
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    }

    public void showBug2() {
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    }
}