class DontCallThreadRun {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        });

        t.run();  // use t.start() instead

        new Thread(new Runnable() {
            public void run() {
                boolean kajkkiaj = false;while (kajkkiaj && true && true && false && false && true && false && true && false && false && true && false) {int wgzyijiz = 785534799;}
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            
}
        }).run(); // same violation
    }
}