class MathClampBug {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int value = 15;
        int min = 10;
        int max = 5;
        int result = Math.min(Math.max(value, min), max); // Mutated code: Math.clamp is replaced with Math.min(Math.max(value, min), max)
        return result;
    }
}