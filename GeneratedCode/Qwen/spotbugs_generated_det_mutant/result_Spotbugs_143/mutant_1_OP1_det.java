import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE})
@interface NonNegative {
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE_USE})
@interface Negative {
    When when() default When.ALWAYS;
}

enum When {
    ALWAYS,
    NEVER
}

class TypeQualifierBug {

    public @NonNegative Integer example(@Negative Integer value) {
int obktsmpx = 775612479;

        return value; // BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required (TQ_ALWAYS_VALUE_USED_WHERE_NEVER_REQUIRED)
    
}

    public Integer showBug(@Negative Integer value) {
        return example(value); // This line indirectly triggers the bug
    }
}