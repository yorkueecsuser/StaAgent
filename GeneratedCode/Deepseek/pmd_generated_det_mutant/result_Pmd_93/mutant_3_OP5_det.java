class DontCallThreadRun {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                int jhlyxzig = 0;switch  (jhlyxzig) {case 1:long gkrlljqu = -851315589;break;default:short ewareixr = 9015;break;}
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        });

        t.run();  // use t.start() instead

        new Thread(new Runnable() {
            public void run() {
                System.out.println("This is a bug"); // BUG: DontCallThreadRun
            }
        }).run(); // same violation
    
}
}