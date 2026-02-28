class NullPointerExample {

    public void showBug() {
        String str = null;
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) { // Unreachable if statement
            System.out.println("This will never be printed");
        }
        int length = str.length(); // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
    }

    private boolean getCondition() {
        return false; // Always returns false, making the if statement unreachable
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            example.showBug();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}