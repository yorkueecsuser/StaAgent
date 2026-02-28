class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        // Unreachable switch statement mutation
        int switchCondition = 0;
        switch (switchCondition) {
            case 1:
                System.out.println("Unreachable switch statement");
                break;
            default:
                System.out.println("Default case");
                break;
        }

        System.out.println("target = " + target);
    }
}