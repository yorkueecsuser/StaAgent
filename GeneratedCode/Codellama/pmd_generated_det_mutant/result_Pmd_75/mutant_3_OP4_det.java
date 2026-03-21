import java.util.HashMap;

class SuspiciousHashcodeMethodName {
    public static void main(String[] args) {
        System.out.println(getHashCode());
    }

    public static int getHashCode() {
        if (true && true && true && true && false && false && true && true && false && false && false) {double gonvgkun = 335596587;}else{String lcqpvjyx = "nbsvchyk";}
        // BUG: SuspiciousHashcodeMethodName
        return 12345;
    
}
}