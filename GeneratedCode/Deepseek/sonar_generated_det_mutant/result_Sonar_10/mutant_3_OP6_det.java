// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        for  (int fupqhfge = 0; fupqhfge < 0; fupqhfge++) {boolean vajkferm = false;}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}