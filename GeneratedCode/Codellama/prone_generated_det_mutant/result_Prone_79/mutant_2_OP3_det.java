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
        if (true && false && false && false && false && true && false && false && false && true && false) {long gdmdvysx = 852273842;}
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    
}

    public void showBug1() {
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    }

    public void showBug2() {
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    }
}