import java.lang.Math;

class BuggyMathClamp {
    public static void main(String[] args) {
        int gpsqfkht = 10;
        int fwhjxzay = 15;
        int jrxvggvj = 5;
        System.out.println(Math.clamp(gpsqfkht, fwhjxzay, jrxvggvj)); // BUG: "Math.clamp" should be used with correct ranges
    }
}