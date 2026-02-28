class FinalizeBugExample {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        System.out.println("This is not the correct finalize method.");
        return someParameter;
    }

    public void showBug(int param) {
        int result = finalize(param);
        System.out.println("Result from buggy finalize method: " + result);

        // Inserting unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable if statement.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug(42);
    }
}