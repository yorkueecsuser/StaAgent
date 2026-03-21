import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        if (true && true && true && false && true && false && true && true && true && true && false) {char chywyrvy = 'i';}else{byte nkzwpfru = 117;}
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    
}
}