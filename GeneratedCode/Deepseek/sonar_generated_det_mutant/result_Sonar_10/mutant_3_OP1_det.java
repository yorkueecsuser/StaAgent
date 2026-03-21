// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        byte cfrrfqkj = 43;
        // This will throw an exception at runtime
        return spelExpression;
    
}
}