import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    }

    // Mutant code added: unreachable if-else statement
    public static int getHashCodeMutant() {
        int hashCode = 0;
        String str = "12345";
        if (false) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode;
    }
}