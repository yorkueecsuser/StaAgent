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

        // Mutant code with renaming
        new Thread(new Runnable() {
            @Override
            public void run() {
                q();
            }
        }); // Mutant: Renamed method call
    }

    private void preventMissionCriticalDisasters() {
        System.out.println("Mission critical disasters prevented!");
    }

    private void q() {
        System.out.println("Mission critical disasters prevented!");
    }
}