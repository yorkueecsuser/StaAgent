class UnusedAnonymousClassBug {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        });
    }

    public static void showBug() {
        main(new String[0]);
    }

    private static void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }

    private static void deadStoreMutant() {
        int randomNumber = (int) (Math.random() * 1000);
        int unusedVariable = randomNumber;
    }
}