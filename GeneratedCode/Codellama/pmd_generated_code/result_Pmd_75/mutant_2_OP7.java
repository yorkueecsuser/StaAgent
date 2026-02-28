import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        int hashCode = 12345;
        while (false) {
            hashCode = hashCode * 31;
        }
        return hashCode;
    }
}