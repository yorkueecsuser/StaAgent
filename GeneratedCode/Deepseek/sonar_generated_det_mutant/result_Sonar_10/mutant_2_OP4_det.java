// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        if (false && true && false && true && true && false && false && true && false && false && false) {float dzmulcnt = -918543908;}else{short atttsvwd = 6281;}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}