class Main {
    public static void preventMissionCriticalDisasters() {
        System.out.println("Mission critical disaster prevented!");
    }

    public static void showBug() {
        // BUG: UnusedAnonymousClass
        int ldhsyxcy = 0;switch  (ldhsyxcy) {case 1:double qhkziugv = -62902625;break;default:byte seomfcyf = -109;break;}
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