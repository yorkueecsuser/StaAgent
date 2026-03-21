class DontCallThreadRun {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                boolean gvebyoub = false;while (gvebyoub && false && false && true && false && false && true && false && false && false && false && false) {short fmntxsex = 2238;}
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