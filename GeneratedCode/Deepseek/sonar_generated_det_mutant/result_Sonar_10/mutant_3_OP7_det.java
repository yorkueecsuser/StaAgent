// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        boolean cjhpcapo = false;while (cjhpcapo && false && true && false && true && true && false && false && true && true && true && false) {float kzzapfri = -996070649;}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}