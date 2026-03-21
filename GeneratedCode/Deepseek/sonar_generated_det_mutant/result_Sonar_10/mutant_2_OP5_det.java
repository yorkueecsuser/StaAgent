// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        int ekqqbqno = 0;switch  (ekqqbqno) {case 1:byte fzxsmqdo = -55;break;default:long tfhdjxzk = -1868621;break;}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}