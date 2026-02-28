class LossyPrimitiveCompare {
    
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE - 1;
        int result = Float.compare(a, b);
        System.out.println("Result: " + result);
    }
    
    public static int showBug() {
        return Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
    }
    
    // Added unreachable if statement
    public static void unreachableIfStatement() {
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
    
    // Added unreachable while loop
    public static void unreachableWhileLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
    
    // Added unreachable for loop
    public static void unreachableForLoop() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
    
    // Added unreachable if-else statement
    public static void unreachableIfElseStatement() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable code
            System.out.println("This code is unreachable");
        } else {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
    
    // Added unreachable switch statement
    public static void unreachableSwitchStatement() {
        int value = getValue();
        switch (value) {
            case 1:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
            default:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
        }
    }
}