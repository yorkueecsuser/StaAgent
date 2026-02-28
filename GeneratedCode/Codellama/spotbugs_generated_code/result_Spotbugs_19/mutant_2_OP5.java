import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        // Unreachable switch statement mutant
        switch (getCondition()) {
            case true:
                // Unreachable code
                break;
            default:
                // Unreachable code
                break;
        }
        return absoluteValue;
    }
}