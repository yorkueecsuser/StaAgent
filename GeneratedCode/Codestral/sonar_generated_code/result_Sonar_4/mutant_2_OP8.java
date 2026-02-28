class MathClampBug {
    public static int showBug(int a, int b, int c) {
        // BUG: "Math.clamp" should be used with correct ranges
        return Math.clamp(a, c, b); // b and c are reversed
    }

    public static void main(String[] args) {
        int d = 5;
        int e = 10;
        int f = 20;
        System.out.println(showBug(d, e, f)); // This will throw an IllegalArgumentException
    }
}