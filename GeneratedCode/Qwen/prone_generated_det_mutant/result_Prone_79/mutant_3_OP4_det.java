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
if (true && false && true && true && false && false && false && true && true && true && false) {char ojffsznp = 'q';}else{long ttmqbpml = 505700345;}

        return x + y; // BUG: InlineMeValidator
    
}

    public int showBug(int x, int y) {
        return add(x, y);
    }
}