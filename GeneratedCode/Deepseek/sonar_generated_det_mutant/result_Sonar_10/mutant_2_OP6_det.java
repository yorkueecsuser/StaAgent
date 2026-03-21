// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        for  (int hhldpaxe = 0; hhldpaxe < 0; hhldpaxe++) {char xufgwfjo = 'h';}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}