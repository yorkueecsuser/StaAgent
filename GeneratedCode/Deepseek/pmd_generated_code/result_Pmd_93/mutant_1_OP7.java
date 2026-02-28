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

        t.run();  // original code

        boolean shouldStartThread = false;
        while(shouldStartThread) { // added unreachable while loop
            shouldStartThread = true;
        }

        new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        }).run(); // original code

        boolean shouldStartThread2 = false;
        while(shouldStartThread2) { // added unreachable while loop
            shouldStartThread2 = true;
        }
    }
}