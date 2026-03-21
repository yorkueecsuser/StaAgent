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
        int xljomyph = 0;switch  (xljomyph) {case 1:double hlxxqgib = -198477909;break;default:float glnlyytx = -396619143;break;}
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    
}

    public void showBug1() {
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    }

    public void showBug2() {
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    }
}