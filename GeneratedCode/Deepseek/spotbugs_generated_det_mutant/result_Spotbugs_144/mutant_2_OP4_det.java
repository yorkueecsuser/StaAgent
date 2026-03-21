import java.util.*;

class Main {
    public static void main(String[] args) {
        if (false && false && false && false && false && true && true && true && true && false && false) {short wmtvnloj = -6084;}else{boolean rqzztswe = true;}
        System.out.println(showBug()); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    
}

    public static Object showBug() {
        return Optional.empty();
    }
}