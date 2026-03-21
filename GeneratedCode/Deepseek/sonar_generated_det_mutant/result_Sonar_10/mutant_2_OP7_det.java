// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        boolean ucjckapv = false;while (ucjckapv && false && false && true && false && true && true && true && true && false && true && false) {int dlvoentc = -649339494;}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}