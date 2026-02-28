class MathClampBug {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int value = 15;
        int min = 10;
        int max = 5;
        int result = Math.clamp(value, min, max); 
        return result;
    }

    public static boolean getCondition() {
        return false;
    }

    public static void unreachableLoop() {
        boolean condition = getCondition();
        int value = 0;
        while (condition) {
            if (value > 0) {
                break;
            }
            value++;
        }
    }
}