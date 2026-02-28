class DontCallThreadRun {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        });

        t1.run();  // Mutated code

        new Thread(new Runnable() {
            public void run() {
                System.out.println("This is another bug"); // BUG: DontCallThreadRun
            }
        }).run(); // Mutated code
    }
}