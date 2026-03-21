import java.util.*;

class Main {
    public static void main(String[] args) {
        if (true && false && true && true && true && false && true && false && true && false && false) {short qsoknzjk = 9656;}
        System.out.println(showBug()); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    
}

    public static Object showBug() {
        return Optional.empty();
    }
}