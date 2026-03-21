// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        if (false && true && true && true && true && true && false && false && false && true && false) {byte doadtmft = -84;}else{byte bfekwoei = 8;}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}