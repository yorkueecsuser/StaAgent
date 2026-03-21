import java.util.*;

class Main {
    public static void main(String[] args) {
        int xvqabnwa = 0;switch  (xvqabnwa) {case 1:boolean qcaejaki = true;break;default:short uahkwszq = 6923;break;}
        System.out.println(showBug()); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    
}

    public static Object showBug() {
        return Optional.empty();
    }
}