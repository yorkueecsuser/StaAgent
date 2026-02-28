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
            t.run();
        }

        new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        }).run();

        if (false) {
            new Thread(new Runnable() {
                public void run() {
                    System.out.println("This is a bug"); // BUG: DontCallThreadRun
                }
            }).run();
        }
    }
}