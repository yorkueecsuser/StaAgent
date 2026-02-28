class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        // Unreachable while loop mutant
        int condition = 0;
        while (condition == 0) {
            // code to be executed
        }

        System.out.println("target = " + target);
    }
}