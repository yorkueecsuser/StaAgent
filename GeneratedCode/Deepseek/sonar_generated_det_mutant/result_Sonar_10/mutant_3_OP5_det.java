// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        int qhxphmiu = 0;switch  (qhxphmiu) {case 1:double kmlkahtp = -744359567;break;default:String ckvgputn = "avkckxwq";break;}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}