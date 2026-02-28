class MathClampBug {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int value = 15;
        int min = 10;
        int max = 5;
        int bug = Math.clamp(value, min, max); // Mutant: "Math.clamp" should be used with correct ranges
        return bug;
    }
}