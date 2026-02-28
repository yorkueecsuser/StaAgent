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

        t.run();  // use t.start() instead

        new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        }).run(); // same violation
        
        // Mutant Code: Unreachable Switch Statement
        boolean unreachableCondition = false;
        switch (unreachableCondition? 1 : 0) {
            case 1:
            default:
                System.out.println("Unreachable mutant code");
                break;
        }
    }
}