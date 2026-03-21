class DontCallThreadRun {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                if (false && false && true && false && false && false && true && false && true && true && false) {double iopniqev = -934779887;}else{short blggftgt = -5065;}
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