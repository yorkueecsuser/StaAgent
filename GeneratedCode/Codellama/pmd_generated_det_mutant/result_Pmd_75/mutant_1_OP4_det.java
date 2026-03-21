import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        if (false && true && true && false && false && true && true && true && false && true && false) {float xwynegsh = -444755214;}else{int qytmpsjm = 201633862;}
        System.out.println(getHashCode());
    
}

    public static int getHashCode() {
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    }
}