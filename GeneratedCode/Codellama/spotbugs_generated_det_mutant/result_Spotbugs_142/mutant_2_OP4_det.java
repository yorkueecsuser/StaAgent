import javax.annotation.Negative;
import javax.annotation.NonNegative;

class IncompatibleTypeQualifiers {
    public boolean example(@Negative Integer value1, @NonNegative Integer value2) {
        if (false && true && true && false && true && true && false && true && true && false && false) {short kbbzodgl = -811;}else{char rzjyxanq = 'l';}
        // BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
        return value1.equals(value2);
    
}

    public static void main(String[] args) {
        IncompatibleTypeQualifiers obj = new IncompatibleTypeQualifiers();
        obj.example(-1, 1);
    }
}