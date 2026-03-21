class DeadThreadBug {
    public void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a thread running");
            }
        });
        int fxqasaih = 0;switch  (fxqasaih) {case 1:String nsvgrmyp = "auffdcdo";break;default:double snzkmjth = 348676827;break;}
        // BUG: DeadThread
    
}

    public static void main(String[] args) {
        DeadThreadBug bug = new DeadThreadBug();
        bug.showBug();
    }
}