// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        for  (int wpnnhnot = 0; wpnnhnot < 0; wpnnhnot++) {int vyettjli = -852527303;}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}