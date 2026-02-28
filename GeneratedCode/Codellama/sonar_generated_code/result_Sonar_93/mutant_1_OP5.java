class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        // Unreachable switch statement mutation
        int condition = getCondition();
        switch (condition) {
            case 0:
                System.out.println("This is unreachable code!");
                break;
            default:
                System.out.println("This is the default case.");
                break;
        }

        System.out.println("target = " + target);
    }

    private static int getCondition() {
        return 0;
    }
}