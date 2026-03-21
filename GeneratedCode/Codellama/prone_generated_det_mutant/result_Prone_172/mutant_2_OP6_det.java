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
        for  (int ocfqoauo = 0; ocfqoauo < 0; ocfqoauo++) {long weccptuc = 106999410;}
        main(new String[0]);
    
}

    private static void preventMissionCriticalDisasters() {
        System.out.println("Preventing disasters...");
    }
}