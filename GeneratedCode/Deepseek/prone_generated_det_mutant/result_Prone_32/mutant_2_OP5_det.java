class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a thread running");
            }
        });
        int exydfwmr = 0;switch  (exydfwmr) {case 1:long zzixnwhv = 295115042;break;default:short dfhgdtey = -8166;break;}
        // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadBug bug = new DeadThreadBug();
        bug.showBug();
    }
}