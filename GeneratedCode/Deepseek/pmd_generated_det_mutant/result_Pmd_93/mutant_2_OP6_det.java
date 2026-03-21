class DontCallThreadRun {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                for  (int rebjdbkm = 0; rebjdbkm < 0; rebjdbkm++) {int gyzbyjqt = 794202797;}
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