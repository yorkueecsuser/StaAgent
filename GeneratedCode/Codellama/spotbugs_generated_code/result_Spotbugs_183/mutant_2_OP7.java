class MS_FINAL_PKGPROTECT {
    public static int count = 0;

    public static void main(String[] args) {
        count++;
        System.out.println("count = " + count);
    }

    public static void showBug() {
        count = 10;
        System.out.println("count = " + count);
    }

    // Add unreachable while loop
    public static void unreachableWhile() {
        boolean condition = getCondition();
        while (condition) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }
    }

    // Add unreachable if-else statement
    public static void unreachableIfElse() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        } else {
            // This code is reachable
            System.out.println("This code is reachable");
        }
    }

    // Add unreachable for loop
    public static void unreachableFor() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }
    }

    // Add unreachable switch statement
    public static void unreachableSwitch() {
        int value = getValue();
        switch (value) {
            case 1:
                // This code is unreachable
                System.out.println("This code is unreachable");
                break;
            default:
                // This code is reachable
                System.out.println("This code is reachable");
        }
    }

    // Helper method to provide boolean condition
    public static boolean getCondition() {
        // This method returns a boolean condition that is not known at compile time
        return Math.random() > 0.5;
    }

    // Helper method to provide integer value
    public static int getValue() {
        // This method returns an integer value that is not known at compile time
        return (int) (Math.random() * 10);
    }
}