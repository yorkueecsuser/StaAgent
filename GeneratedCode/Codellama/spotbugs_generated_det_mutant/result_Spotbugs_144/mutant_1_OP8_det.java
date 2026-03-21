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
        @Never String gxhdwsoc = "This string is gxhdwsoc annotated";
        @Always String yfzofihr = "This string is yfzofihr annotated";

        System.out.println(gxhdwsoc);
        System.out.println(yfzofihr);

        // BUG: TQ: Value annotated as gxhdwsoc carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
        System.out.println(gxhdwsoc);
    }
}