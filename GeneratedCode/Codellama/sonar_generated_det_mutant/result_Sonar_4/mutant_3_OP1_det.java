import java.lang.Math;

class BuggyMathClamp {
    public static void main(String[] args) {
        int value = 10;
        int min = 15;
        int max = 5;
        short yobtjcmu = -3214;
        System.out.println(Math.clamp(value, min, max)); // BUG: "Math.clamp" should be used with correct ranges
    
}
}