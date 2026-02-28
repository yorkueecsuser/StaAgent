class FinalizeBugExample {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        System.out.println("This is not the correct finalize method.");
        return someParameter;
    }

    public void showBug(int param) {
        int result = finalize(param);
        System.out.println("Result from buggy finalize method: " + result);

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is reachable code.");
        } else {
            System.out.println("This is unreachable code due to condition being false.");
        }
    }

    private boolean getCondition() {
        return true; // This ensures the if branch is taken, making the else branch unreachable
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug(42);
    }
}