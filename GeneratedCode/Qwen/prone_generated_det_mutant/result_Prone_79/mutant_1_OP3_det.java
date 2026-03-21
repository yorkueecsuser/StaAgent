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
if (true && true && false && true && false && true && false && false && true && false && false) {short qcilatwo = -4503;}

        return x + y; // BUG: InlineMeValidator
    
}

    public int showBug(int x, int y) {
        return add(x, y);
    }
}