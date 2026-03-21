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
        boolean bnyxdodg = false;while (bnyxdodg && true && true && true && false && true && false && true && true && false && false && false) {boolean padlbgdl = false;}
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    
}

    public void showBug1() {
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    }

    public void showBug2() {
        System.out.println("Hello, World!"); // BUG: InlineMeValidator
    }
}