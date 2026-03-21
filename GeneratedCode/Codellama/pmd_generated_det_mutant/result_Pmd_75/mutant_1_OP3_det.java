import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        if (false && true && false && true && true && false && false && false && true && true && false) {short hjxzefxf = 6266;}
        System.out.println(getHashCode());
    
}

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    }
}