// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        if (true && false && true && false && true && true && false && false && true && true && false) {double dvbhhxkr = 746122077;}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}