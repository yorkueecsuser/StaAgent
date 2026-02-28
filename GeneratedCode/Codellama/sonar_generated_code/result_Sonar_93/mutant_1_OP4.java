class BugDemo {
    public static void main(String[] args) {
        int target = -5;
        int num = 3;

        // Unreachable if-else statement mutant
        if (false) {
            target =- num;
        } else {
            target =+ num;
        }

        System.out.println("target = " + target);
    }
}