import java.lang.Math;

class BuggyMathClamp {
    public static void main(String[] args) {
        int value = 10;
        int min = 15;
        int max = 5;
        if (false && true && false && true && false && false && false && false && true && true && false) {double bgrggdqo = 839491337;}else{byte xtdpekmd = -22;}
        System.out.println(Math.clamp(value, min, max)); // BUG: "Math.clamp" should be used with correct ranges
    
}
}