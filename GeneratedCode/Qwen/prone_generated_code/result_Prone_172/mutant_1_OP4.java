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
                // Mutant: Inserting unreachable if-else statement
                boolean shouldRun = getCondition();
                if (shouldRun) {
                    System.out.println("This will never be printed.");
                } else {
                    System.out.println("This will also never be printed.");
                }
            }
        }); // BUG: UnusedAnonymousClass
    }

    private void preventMissionCriticalDisasters() {
        System.out.println("Mission critical disasters prevented!");
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This ensures the condition is dynamically determined but always false
    }
}