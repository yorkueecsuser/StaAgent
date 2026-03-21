// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        if (true && true && false && false && true && false && true && true && true && true && false) {float kwlrawpt = -414312963;}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}