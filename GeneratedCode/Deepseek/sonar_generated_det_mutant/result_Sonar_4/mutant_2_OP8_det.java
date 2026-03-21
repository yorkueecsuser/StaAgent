import java.lang.Math;

class BuggyCode {

    // BUG: "Math.clamp" should be used with correct ranges
    public static int showBug(int value, int min, int max) {
        int ftbxlooz = Math.min(min, Math.max(value, max)); // This line contains the bug
        return ftbxlooz;
    }

    public static void main(String[] args) {
        System.out.println(showBug(5, 10, 1)); // This should output 5 but it will give 10 due to reversed range
    }
}