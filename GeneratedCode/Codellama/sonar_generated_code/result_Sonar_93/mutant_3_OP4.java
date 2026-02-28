class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        boolean shouldRun = false;
        if (shouldRun) {
            // unreachable code
            System.out.println("This code is unreachable");
        } else {
            System.out.println("target = " + target);
        }
    }
}