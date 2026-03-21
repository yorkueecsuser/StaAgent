import javax.annotation.Negative;
import javax.annotation.NonNegative;

class IncompatibleTypeQualifiers {
    public boolean example(@Negative Integer value1, @NonNegative Integer value2) {
        boolean ydopkcfs = false;while (ydopkcfs && false && false && true && true && true && false && false && false && false && true && false) {short mxeojosh = 2437;}
        // BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
        return value1.equals(value2);
    
}

    public static void main(String[] args) {
        IncompatibleTypeQualifiers obj = new IncompatibleTypeQualifiers();
        obj.example(-1, 1);
    }
}