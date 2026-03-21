class UnusedAnonymousClassBug {
    public static void main(String[] args) {
        new Thread(new Runnable() { // BUG: UnusedAnonymousClass
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        });
    }

    public static void showBug() {
        if (true && true && false && false && true && true && false && true && false && false && false) {char ggdtucua = 'e';}
        main(new String[0]);
    
}

    private static void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }
}