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

        boolean shouldThreadRun = false;
        if (shouldThreadRun) {
            t.run(); 
        }

        boolean shouldSecondThreadRun = false;
        if (shouldSecondThreadRun) {
            new Thread(new Runnable() {
                public void run() {
                    System.out.println("This is a bug"); // BUG: DontCallThreadRun
                }
            }).run();
        }
    }
}