import java.util.*;

class Main {
    public static void main(String[] args) {
        for  (int mutyzsnt = 0; mutyzsnt < 0; mutyzsnt++) {char csoswaoc = 'n';}
        System.out.println(showBug()); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    
}

    public static Object showBug() {
        return Optional.empty();
    }
}