class MathClampBug {
    public static void main(String[] args) {
        showBug();
    }

    public static int showBug() {
        int value = 15;
        int min = 10;
        int max = 5;
        boolean condition = getCondition(); // New Unreachable statement
        int result = Math.clamp(value, min, max);
        if (condition) { // This if statement is unreachable
            System.out.println("This is unreachable code");
        }
        return result;
    }
    
    public static boolean getCondition() {
        return false;
    }
}