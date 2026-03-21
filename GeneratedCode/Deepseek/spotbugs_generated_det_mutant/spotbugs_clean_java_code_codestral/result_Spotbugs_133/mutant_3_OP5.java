class UselessStringBug {

    public String showBug() {
        // Original code
        String result = new int[] {1, 2, 3}.toString();

        // Mutated code: Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This code will never be executed.");
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        UselessStringBug bug = new UselessStringBug();
        System.out.println(bug.showBug());
    }

    // Helper method to avoid compile-time constants
    private static int getValue() {
        return 0;
    }
}