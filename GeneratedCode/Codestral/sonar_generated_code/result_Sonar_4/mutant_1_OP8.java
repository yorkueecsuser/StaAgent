class MathClampBug {
    public static int showBug(int a, int b, int c) {
        // BUG: "Math.clamp" should be used with correct ranges
        int m = Math.clamp(a, c, b); // m and c are reversed
        return m;
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}