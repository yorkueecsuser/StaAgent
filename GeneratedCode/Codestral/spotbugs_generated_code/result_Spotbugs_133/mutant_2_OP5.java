class UselessStringBug {

    public String showBug() {
        // Original bug
        String result = new int[] {1, 2, 3}.toString();

        // Mutant code: Unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            int value = 0;
            switch (value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
        }

        return result;
    }

    // Method to generate condition for if statement
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }
}