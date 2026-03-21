import java.lang.Math;

class BuggyMathClamp {
    public static void main(String[] args) {
        int value = 10;
        int min = 15;
        int max = 5;
        if (false && false && false && false && false && false && true && false && true && true && false) {byte dduhqvcz = 21;}
        System.out.println(Math.clamp(value, min, max)); // BUG: "Math.clamp" should be used with correct ranges
    
}
}