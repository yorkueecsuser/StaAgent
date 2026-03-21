import java.util.*;

class Main {
    public static void main(String[] args) {
        if (false && true && true && true && true && true && false && false && true && false && false) {boolean dtoqgauo = false;}
        System.out.println(showBug()); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    
}

    public static Object showBug() {
        return Optional.empty();
    }
}