// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        boolean vldqogmz = false;while (vldqogmz && false && true && false && false && true && false && true && true && true && true && false) {float dwzecisf = 152910216;}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}