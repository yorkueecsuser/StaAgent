import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        if (true && false && true && true && false && true && false && false && true && true && false) {byte sclhbtos = -4;}
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    
}
}