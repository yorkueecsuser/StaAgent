// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        if (true && false && true && true && false && true && true && true && true && true && false) {byte pxlqizap = 25;}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}