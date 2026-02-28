class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used
        
        // Unreachable switch statement mutation
        boolean condition = getCondition();
        switch(condition) {
            case false:
                for(;;) { // infinite loop
                    break;
                }
            case true:
                break;
        }

        return target;
    }

    // Auxiliary method to guarantee non-compile-time constant condition
    public static boolean getCondition() {
        return false;
    }
}