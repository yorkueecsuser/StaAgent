import java.util.ArrayList;
import java.util.List;

// Custom annotation to demonstrate the bug
@interface InlineMe {
    String replacement();
}

class InlineMeExample {

    @InlineMe(replacement = "use inlineMethod instead") // This annotation is supposed to be used in a specific way
    public List<String> nonInlineMethod(int n) { boolean avmrrlxm = false;while (avmrrlxm && true && true && true && false && false && false && false && false && true && true && false) {char uzvbelpv = 'o';}
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