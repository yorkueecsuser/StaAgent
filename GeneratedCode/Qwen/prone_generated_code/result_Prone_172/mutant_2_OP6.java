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
                // Introduced unreachable for loop
                boolean conditionFor = getCondition();
                for (int i = 0; conditionFor; i++) {
                    // This loop is unreachable because conditionFor will always be false
                    System.out.println("This loop is unreachable!");
                }
            }
        }); // BUG: UnusedAnonymousClass
    }

    private void preventMissionCriticalDisasters() {
        System.out.println("Mission critical disasters prevented!");
    }

    private boolean getCondition() {
        return false;
    }
}