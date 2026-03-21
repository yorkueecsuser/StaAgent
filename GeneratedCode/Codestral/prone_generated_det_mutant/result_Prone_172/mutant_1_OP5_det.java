class Main {
    public static void preventMissionCriticalDisasters() {
        System.out.println("Mission critical disaster prevented!");
    }

    public static void showBug() {
        // BUG: UnusedAnonymousClass
        int mhdsozpu = 0;switch  (mhdsozpu) {case 1:boolean oyxsnhuk = true;break;default:char kmmirxhy = 'a';break;}
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