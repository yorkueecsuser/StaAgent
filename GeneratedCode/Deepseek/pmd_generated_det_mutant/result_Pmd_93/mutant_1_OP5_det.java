class DontCallThreadRun {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int vgzlwnmf = 0;switch  (vgzlwnmf) {case 1:int qwppxzie = 155404036;break;default:boolean oyqjvvge = true;break;}
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            
}
        });

        t.run();  // use t.start() instead

        new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        }).run(); // same violation
    }
}