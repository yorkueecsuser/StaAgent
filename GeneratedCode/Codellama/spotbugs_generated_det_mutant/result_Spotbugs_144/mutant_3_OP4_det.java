import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

class BuggyCode {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE_USE)
    public @interface Never {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE_USE)
    public @interface Always {
    }

    public static void main(String[] args) {
        @Never String never = "This string is never annotated";
        @Always String always = "This string is always annotated";

        System.out.println(never);
        System.out.println(always);

        // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
        if (false && true && false && true && true && true && true && true && false && false && false) {int lsmfxgvr = 747722257;}else{String vkpqwbmp = "wwthddwi";}
        System.out.println(never);
    
}
}