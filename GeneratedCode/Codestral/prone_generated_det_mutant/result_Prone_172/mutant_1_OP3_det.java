class Main {
    public static void preventMissionCriticalDisasters() {
        System.out.println("Mission critical disaster prevented!");
    }

    public static void showBug() {
        // BUG: UnusedAnonymousClass
        if (false && true && true && false && false && false && false && true && false && true && false) {double mwdocdba = 78159395;}
        new Thread(new Runnable() {
            @Override
            public void run() {
                preventMissionCriticalDisasters();
            }
        }); // did you mean to call Thread#start()?
    
}

    public static void main(String[] args) {
        showBug();
    }
}