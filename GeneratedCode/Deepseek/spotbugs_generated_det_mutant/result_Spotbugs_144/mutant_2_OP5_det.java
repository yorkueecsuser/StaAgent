import java.util.*;

class Main {
    public static void main(String[] args) {
        int ogsbrbgy = 0;switch  (ogsbrbgy) {case 1:int bquatmru = 34003250;break;default:String qkzyjcwt = "ahizpzge";break;}
        System.out.println(showBug()); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
    
}

    public static Object showBug() {
        return Optional.empty();
    }
}