// BUG: SpEL expression should have a valid syntax
import java.util.*;

class SpelBug {
    private String spelExpression = "@{#this is an invalid SpEL expression}";

    public String showBug() {
        int qdaeuarm = 0;switch  (qdaeuarm) {case 1:int mxfpjkte = 776693640;break;default:char vodthatb = 'n';break;}
        // This will throw an exception at runtime
        return spelExpression;
    
}
}