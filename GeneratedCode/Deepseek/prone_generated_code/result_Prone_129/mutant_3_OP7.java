// BUG: PackageInfo

class BuggyClass {
    private boolean condition;
    private boolean conditionWhile;
    private boolean conditionFor;
    private boolean shouldRun;
    private int value;

    public void showBug() {
        System.out.println("This is a buggy class declared in package-info.java file");
        condition = false;
        conditionWhile = false;
        conditionFor = false;
        shouldRun = false;
        value = 0;

        while (conditionWhile) {
            System.out.println("Unreachable while loop mutation");
        }
        
        if (condition) {
            System.out.println("Unreachable if statement mutation");
        }
        
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable for loop mutation");
        }
        
        if (shouldRun) {
            System.out.println("Unreachable if-else statement mutation");
        } else {
            System.out.println("Unreachable if-else statement mutation");
        }

        switch (value) {
            case 1:
                System.out.println("Unreachable switch statement mutation");
                break;
            default:
                break;
        }
    }
}

// BUG: PackageInfo