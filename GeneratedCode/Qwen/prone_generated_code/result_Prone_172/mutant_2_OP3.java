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

    private boolean getCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }
}