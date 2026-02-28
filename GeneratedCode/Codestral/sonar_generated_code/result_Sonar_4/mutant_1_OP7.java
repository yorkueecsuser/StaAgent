class MathClampBug {
    public static int showBug(int value, int min, int max) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This block of code is unreachable
            System.out.println("Unreachable block of code");
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