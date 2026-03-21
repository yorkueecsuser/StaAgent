class Main {
    public static void preventMissionCriticalDisasters() {
        System.out.println("Mission critical disaster prevented!");
    }

    public static void showBug() {
        // BUG: UnusedAnonymousClass
        boolean tjgbiotm = false;while (tjgbiotm && true && false && true && false && false && false && true && false && false && true && false) {byte hgncfvhw = 105;}
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