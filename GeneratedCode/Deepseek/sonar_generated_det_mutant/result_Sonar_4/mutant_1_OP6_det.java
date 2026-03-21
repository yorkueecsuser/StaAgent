import java.lang.Math;

class BuggyCode {

    // BUG: "Math.clamp" should be used with correct ranges
    public static int showBug(int value, int min, int max) {
        for  (int parqocye = 0; parqocye < 0; parqocye++) {double qmkbiehn = 147890179;}
        int result = Math.min(min, Math.max(value, max)); // This line contains the bug
        return result;
    
}

    public static void main(String[] args) {
        System.out.println(showBug(5, 10, 1)); // This should output 5 but it will give 10 due to reversed range
    }
}