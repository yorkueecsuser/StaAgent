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
                // Introduced unreachable if statement
                boolean condition = getCondition();
                if (condition) {
                    System.out.println("This is an unreachable statement.");
                }
            }
        }); // BUG: UnusedAnonymousClass
    }

    private void preventMissionCriticalDisasters() {
        System.out.println("Mission critical disasters prevented!");
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This will ensure the condition is always false at runtime
    }
}