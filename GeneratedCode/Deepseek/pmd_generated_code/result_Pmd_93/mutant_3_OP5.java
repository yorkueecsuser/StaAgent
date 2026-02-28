class DontCallThreadRun {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                if (false) { // Mutation: Unreachable Switch Statement
                    System.out.println("This is a mutation");
                } else {
                    System.out.println("This is a bug"); // BUG: DontCallThreadRun
                }
            }
        });

        t.run();  // use t.start() instead

        new Thread(new Runnable() {
            public void run() {
                if (false) { // Mutation: Unreachable Switch Statement
                    System.out.println("This is a mutation");
                } else {
                    System.out.println("This is a bug"); // BUG: DontCallThreadRun
                }
            }
        }).run(); // same violation
    }
}