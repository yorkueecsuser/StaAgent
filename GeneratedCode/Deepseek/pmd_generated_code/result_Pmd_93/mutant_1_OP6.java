class DontCallThreadRun {
    static boolean condition = true;

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        });

        if(condition) t.start();  // use t.start() instead

        for(int i = 0 ; condition ; i++){
            new Thread(new Runnable() {
                public void run() {
                    System.out.println("This is a bug"); // BUG: DontCallThreadRun
                }
            }).run(); // same violation
        }
    }
}