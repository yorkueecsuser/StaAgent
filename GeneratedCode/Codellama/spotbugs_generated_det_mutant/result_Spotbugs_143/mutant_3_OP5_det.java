import java.lang.annotation.*;

class Example {

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
    @interface NonNegative {}

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
    @interface Negative {
        When when() default When.NEVER;
    }

    public enum When {
        ALWAYS,
        NEVER
    }

    @Negative(when = When.ALWAYS)
    public Integer example(@NonNegative Integer value) {
int xfmzeuwx = 0;switch  (xfmzeuwx) {case 1:short cuwqhukv = 4868;break;default:long zyzuqsnx = 402364498;break;}

        return value; // BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required (TQ_ALWAYS_VALUE_USED_WHERE_NEVER_REQUIRED)
    
}

    public void showBug(Integer value) {
        System.out.println(example(value));
    }
}