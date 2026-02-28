class MathClampBug {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int value = 15;
        int min = 10;
        int max = 5;
        String unusedVariable = "abcdefgh"; // mutation: unused variable
        int result = Math.clamp(value, min, max); // BUG: "Math.clamp" should be used with correct ranges
        return result;
    }
}