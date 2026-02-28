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
                // Dead Store Mutation
                String jxvqzrht = "unusedVariable";
            }
        }); // BUG: UnusedAnonymousClass
    }

    private void preventMissionCriticalDisasters() {
        System.out.println("Mission critical disasters prevented!");
    }
}