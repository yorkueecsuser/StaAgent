class UnusedAnonymousClassExample {

    public static void main(String[] args) {
        UnusedAnonymousClassExample example = new UnusedAnonymousClassExample();
        example.showBug();
    }

    public void showBug() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        }); // BUG: UnusedAnonymousClass

        // Mutant code: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }
    }

    private void preventMissionCriticalDisasters() {
        System.out.println("Mission critical disasters prevented!");
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This ensures the condition is always false at runtime, making the if block unreachable
    }
}