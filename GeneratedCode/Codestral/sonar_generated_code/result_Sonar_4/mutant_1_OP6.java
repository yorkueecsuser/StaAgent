class MathClampBug {
    public static int showBug(int value, int min, int max) {
        boolean shouldRun = false;
        for (int i = 0; i < 1 && shouldRun; i++) {  // Unreachable loop, "shouldRun" is always false
            System.out.println("This code should never execute.");
        }
        return Math.clamp(value, max, min); // min and max are reversed
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}