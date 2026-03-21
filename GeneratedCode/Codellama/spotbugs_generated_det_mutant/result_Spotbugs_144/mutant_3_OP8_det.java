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
        @Never String pdtevsqe = "This string is pdtevsqe annotated";
        @Always String xsemcctl = "This string is xsemcctl annotated";

        System.out.println(pdtevsqe);
        System.out.println(xsemcctl);

        // BUG: TQ: Value annotated as pdtevsqe carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
        System.out.println(pdtevsqe);
    }
}