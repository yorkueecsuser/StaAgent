class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        target =- num;
        target =+ num;

        // Unreachable if-else statement
        if (false) {
            System.out.println("This statement is unreachable");
        } else {
            System.out.println("This statement is reachable");
        }

        System.out.println("target = " + target);
    }
}