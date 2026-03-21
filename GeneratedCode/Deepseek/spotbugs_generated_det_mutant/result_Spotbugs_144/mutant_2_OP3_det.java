import java.util.*;

class Main {
    public static void main(String[] args) {
        if (false && true && false && false && false && false && false && true && false && false && false) {float npnxtppk = 639358013;}
        System.out.println(showBug()); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    
}

    public static Object showBug() {
        return Optional.empty();
    }
}