class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        System.out.println("target = " + target);

        // Unreachable if statement mutation
        if (false) {
            System.out.println("This line is unreachable");
        }
    }
}