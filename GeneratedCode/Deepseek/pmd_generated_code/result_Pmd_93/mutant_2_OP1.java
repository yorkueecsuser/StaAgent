class DontCallThreadRun {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                String a1b2c3d; // Mutation: Dead Store
                a1b2c3d = "This is a bug"; // BUG: DontCallThreadRun
                System.out.println(a1b2c3d); 
            }
        });

        t.run();  // use t.start() instead

        new Thread(new Runnable() {
            public void run() {
                String e4f5g6h; // Mutation: Dead Store
                e4f5g6h = "This is a bug"; // BUG: DontCallThreadRun
                System.out.println(e4f5g6h); 
            }
        }).run(); // same violation
    }
}