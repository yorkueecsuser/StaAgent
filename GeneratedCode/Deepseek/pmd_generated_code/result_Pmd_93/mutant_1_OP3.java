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

        if (false) {
            t.run(); // this if statement is always false and unreachable, but it is added to make the code unreachable
        }

        boolean alwaysFalse = false;
        new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        }).run(); // same violation

        if (alwaysFalse) {
            // This is a mutant variant of the previous if statement
            // This if statement is always false and unreachable, but it is added to make the code unreachable
        }
    }
}