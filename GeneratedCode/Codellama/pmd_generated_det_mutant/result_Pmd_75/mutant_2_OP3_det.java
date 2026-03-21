import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        if (false && false && true && true && true && true && true && true && false && true && false) {double emyljeyo = 611372489;}
        System.out.println(getHashCode());
    
}

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    }
}