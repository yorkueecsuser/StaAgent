class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;
        int count = 0;

        // Unreachable for loop
        for (int i = 0; false; i++) {
            count++;
        }

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);
    }
}