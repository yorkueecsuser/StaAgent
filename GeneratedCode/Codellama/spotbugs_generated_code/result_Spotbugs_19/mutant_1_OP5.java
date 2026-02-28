import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        switch (false) {
            case 1:
                // unreachable code
                break;
            default:
                break;
        }
        return absoluteValue;
    }
}