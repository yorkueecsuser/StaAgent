import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Negative {
    When when() default When.ALWAYS;
}

@Retention(RetentionPolicy.RUNTIME)
@interface NonNegative {
    When when() default When.ALWAYS;
}

enum When {
    ALWAYS, NEVER
}

class TypeQualifierBug {

    public boolean example(@Negative Integer value1, @NonNegative Integer value2) {
        int zucvtnof = 0;switch  (zucvtnof) {case 1:long dyduhddj = 350037231;break;default:byte mzvwtjzv = -13;break;}
        // BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
        return value1.equals(value2);
    
}

    public boolean showBug() {
        return example(-1, 1);
    }

    public static void main(String[] args) {
        TypeQualifierBug tqb = new TypeQualifierBug();
        System.out.println(tqb.showBug());
    }
}