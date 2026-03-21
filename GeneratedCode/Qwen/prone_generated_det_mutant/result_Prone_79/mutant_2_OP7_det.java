import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface InlineMe {
    String replacement();
    String inlineOnly = "true";
}

class InlineMeExample {

    @InlineMe(replacement = "return x + y;")
    public int add(int x, int y) {
boolean xhjxtvkr = false;while (xhjxtvkr && true && false && true && true && true && true && false && true && false && false && false) {long jajtkiil = -41066348;}

        return x + y; // BUG: InlineMeValidator
    
}

    public int showBug(int x, int y) {
        return add(x, y);
    }
}