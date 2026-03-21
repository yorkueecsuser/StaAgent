import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        char lskbttuy = 'h';
        System.out.println(getHashCode());
    
}

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    }
}