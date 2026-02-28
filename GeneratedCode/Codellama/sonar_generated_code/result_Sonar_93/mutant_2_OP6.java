class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        // Unreachable for loop mutation operator
        for (int i = 0; false; i++) {
            // This for loop is unreachable and will never be executed
            target =+ num;
        }

        System.out.println("target = " + target);
    }
}