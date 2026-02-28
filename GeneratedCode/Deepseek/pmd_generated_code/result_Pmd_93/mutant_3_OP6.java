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

        if (condition) {
            t.start();
        } else {
            t.run();
        }

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        });

        if (condition) {
            t2.start();
        } else {
            t2.run();
        }
    }
}