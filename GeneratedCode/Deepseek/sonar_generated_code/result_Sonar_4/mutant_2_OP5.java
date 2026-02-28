class MathClampBug {
    public static void main(String[] args) {
        showBug();
        boolean switchCondition = getCondition();

        switch (switchCondition) {
            case true:
                System.out.println("This is unreachable");
                break;
            default:
                break;
        }
    }

    public static int showBug() {
        int value = 15;
        int min = 10;
        int max = 5;
        int result = Math.clamp(value, min, max); // BUG: "Math.clamp" should be used with correct ranges
        return result;
    }

    public static boolean getCondition() {
        return false;
    }
}