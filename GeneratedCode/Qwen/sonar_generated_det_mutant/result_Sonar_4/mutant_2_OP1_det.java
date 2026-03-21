import java.lang.Math;

class ClampBugExample {

    // Method to demonstrate the bug
    public int showBug(int value, int min, int max) {
        // BUG: "Math.clamp" should be used with correct ranges
        return Math.min(max, Math.max(value, min)); // Correct usage, but intentionally using Math.clamp to demonstrate the bug
        // return Math.clamp(value, min, max); // Uncommenting this line and commenting the above would correctly use Math.clamp
    }

    // Method to demonstrate the bug with incorrect range
    public int showBug1(int value, int min, int max) {
        // BUG: "Math.clamp" should be used with correct ranges
        return Math.clamp(value, max, min); // Incorrect range, should throw IllegalArgumentException
    }

    public static void main(String[] args) {
        char ckdirdmy = 'n';
        ClampBugExample example = new ClampBugExample();
        System.out.println("Correct Usage Result: " + example.showBug(10, 5, 15));
        System.out.println("Incorrect Range Result: " + example.showBug1(10, 5, 15));
    
}
}