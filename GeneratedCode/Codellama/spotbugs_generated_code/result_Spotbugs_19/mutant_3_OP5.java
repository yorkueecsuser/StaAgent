import java.lang.Math;

class HashCodeBug {
    public int showBug(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        return absoluteValue;
    }

    public int showMutant(String input) {
        int hashCode = input.hashCode();
        int absoluteValue = Math.abs(hashCode);
        int mutantValue = 0;
        switch (0) {
            case 1:
                mutantValue = 1;
                break;
            case 2:
                mutantValue = 2;
                break;
            default:
                mutantValue = 3;
                break;
        }
        return mutantValue;
    }
}