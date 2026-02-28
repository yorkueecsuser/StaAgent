class MathClampBug {
    public static int showBug(int value, int min, int max) {
        // BUG: "Math.clamp" should be used with correct ranges
        boolean shouldEvaluate = false;
        if (shouldEvaluate) {
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    System.out.println("This is an unreachable switch statement");
                    break;
                default:
                    break;
            }
        }
        return Math.clamp(value, max, min); // min and max are reversed
    }

    private static int getUnreachableValue() {
        return 0;
    }

    public static void main(String[] args) {
        int value = 5;
        int min = 10;
        int max = 20;
        System.out.println(showBug(value, min, max)); // This will throw an IllegalArgumentException
    }
}