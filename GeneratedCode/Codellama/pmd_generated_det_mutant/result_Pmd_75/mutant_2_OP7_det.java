import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        boolean pitksucq = false;while (pitksucq && true && true && false && false && false && false && true && true && true && true && false) {byte irqxiyqr = 21;}
        System.out.println(getHashCode());
    
}

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    }
}