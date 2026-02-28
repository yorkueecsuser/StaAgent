class MathClampBug {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int value = 15;
        int min = 10;
        int max = 5;
        int result = Math.clamp(value, min, max); // BUG: "Math.clamp" should be used with correct ranges
        boolean condition = getCondition(min, max); 
        if (condition) {
            result = Math.clamp(value, max, min);
        }
        return result;
    }

    public static Boolean getCondition(int min, int max) {
        return min > max;
    }
}