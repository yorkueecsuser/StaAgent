class DontCallThreadRun {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String unusedVar1 = "unusedVar1"; // dead store 1
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        });

        t.run();  // use t.start() instead

        String unusedVar2 = "unusedVar2"; // dead store 2
        new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        }).run(); // same violation
    }
}