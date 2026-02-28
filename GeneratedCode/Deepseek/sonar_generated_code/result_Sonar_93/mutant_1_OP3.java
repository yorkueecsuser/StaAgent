class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int target = -5;
        int num = 3;

        target =- num;  // BUG: Non-existent operators like "=+" should not be used
        target =+ num; // BUG: Non-existent operators like "=+" should not be used

        boolean unreachable = false; // Mutation for Unreachable if statement
        if (unreachable) {
            target = 0;
        }
        return target;
    }
}