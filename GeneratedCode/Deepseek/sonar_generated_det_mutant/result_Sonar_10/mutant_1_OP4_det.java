// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        if (true && true && true && true && true && false && true && true && false && true && false) {byte rhvznfkm = 71;}else{String fusctyfz = "bfwkwryg";}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}