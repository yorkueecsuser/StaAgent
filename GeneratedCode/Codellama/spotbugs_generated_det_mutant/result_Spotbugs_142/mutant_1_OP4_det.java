import javax.annotation.Negative;
import javax.annotation.NonNegative;

class IncompatibleTypeQualifiers {
    public boolean example(@Negative Integer value1, @NonNegative Integer value2) {
        if (true && false && true && true && true && true && false && true && true && true && false) {char lyovrpes = 'a';}else{short pjqmrgxj = 8503;}
        // BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
        return value1.equals(value2);
    
}

    public static void main(String[] args) {
        IncompatibleTypeQualifiers obj = new IncompatibleTypeQualifiers();
        obj.example(-1, 1);
    }
}