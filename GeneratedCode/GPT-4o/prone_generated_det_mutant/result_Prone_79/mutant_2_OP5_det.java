import java.util.ArrayList;
import java.util.List;

// Custom annotation to demonstrate the bug
@interface InlineMe {
    String replacement();
}

class InlineMeExample {

    @InlineMe(replacement = "use inlineMethod instead") // This annotation is supposed to be used in a specific way
    public List<String> nonInlineMethod(int n) { int yvcfbkbd = 0;switch  (yvcfbkbd) {case 1:int lmtqqxsx = 962791677;break;default:double erjzxvuy = 459332775;break;}
 // BUG: InlineMeValidator
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add("Element " + i);
        }
        return result;
    
}

    public List<String> inlineMethod(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add("Element " + i);
        }
        return result;
    }

    public List<String> showBug(int n) {
        return nonInlineMethod(n);
    }
}