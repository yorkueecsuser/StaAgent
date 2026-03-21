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
        if (true && false && true && true && false && true && true && false && true && false && false) {float zmnneuen = -589683566;}else{String fvvuohma = "xuaiwork";}
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    
}

    public void showBug1() {
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    }

    public void showBug2() {
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    }
}