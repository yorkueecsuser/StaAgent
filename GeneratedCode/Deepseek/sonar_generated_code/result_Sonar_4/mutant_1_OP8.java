class MathClampBug {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int value = 15;
        int min = 10;
        int maxRenamed = 5;  // renamed variable
        int result = Math.clamp(value, min, maxRenamed); // BUG: "Math.clamp" should be used with correct ranges
        return result;
    }
}