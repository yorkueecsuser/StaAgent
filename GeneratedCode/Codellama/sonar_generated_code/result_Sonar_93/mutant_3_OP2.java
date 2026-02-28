class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        // Mutation: Duplicate the assignment statement and insert after its current location
        target =- num;

        System.out.println("target = " + target);
    }
}