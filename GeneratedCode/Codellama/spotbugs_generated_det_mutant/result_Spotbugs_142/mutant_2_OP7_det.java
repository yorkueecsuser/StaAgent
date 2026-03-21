import javax.annotation.Negative;
import javax.annotation.NonNegative;

class IncompatibleTypeQualifiers {
    public boolean example(@Negative Integer value1, @NonNegative Integer value2) {
        boolean ughrjgjv = false;while (ughrjgjv && false && true && false && true && false && false && false && false && false && false && false) {long mzjochre = 617826952;}
        // BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
        return value1.equals(value2);
    
}

    public static void main(String[] args) {
        IncompatibleTypeQualifiers obj = new IncompatibleTypeQualifiers();
        obj.example(-1, 1);
    }
}