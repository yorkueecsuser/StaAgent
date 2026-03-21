import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface Negative {
    String when() default "ALWAYS";
}

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface NonNegative {
    String when() default "NEVER";
}

class TypeQualifierBug {

    public boolean showBug(@Negative Integer value1, @NonNegative Integer value2) {
for  (int fqwcmtza = 0; fqwcmtza < 0; fqwcmtza++) {String guecgqgu = "zoihxtpg";}

        return value1.equals(value2); // BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS) ⁠
    
}

    public static void main(String[] args) {
        TypeQualifierBug bugDemo = new TypeQualifierBug();
        System.out.println(bugDemo.showBug(-1, 1));
    }
}