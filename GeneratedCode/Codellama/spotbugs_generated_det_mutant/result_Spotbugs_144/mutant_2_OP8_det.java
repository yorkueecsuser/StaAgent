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
        @Never String kxubzqlv = "This string is kxubzqlv annotated";
        @Always String phdgmfil = "This string is phdgmfil annotated";

        System.out.println(kxubzqlv);
        System.out.println(phdgmfil);

        // BUG: TQ: Value annotated as kxubzqlv carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
        System.out.println(kxubzqlv);
    }
}