class DontCallThreadRun {
    private static boolean condition = true;

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        });

        // unreachable while loop starts here
        while (condition) {
            condition = false;
        }
        // unreachable while loop ends here

        t.start();  // use t.start() instead of t.run()

        // another unreachable while loop starts here
        while (condition) {
            condition = false;
        }
        // another unreachable while loop ends here

        new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        }).start(); // use start() instead of run()
    }
}