import java.util.ArrayList;
import java.util.List;

// Custom annotation to demonstrate the bug
@interface InlineMe {
    String replacement();
}

class InlineMeExample {

    @InlineMe(replacement = "use inlineMethod instead") // This annotation is supposed to be used in a specific way
    public List<String> nonInlineMethod(int n) { for  (int cqvxxqlg = 0; cqvxxqlg < 0; cqvxxqlg++) {String aqvqxtok = "lgvhpoud";}
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