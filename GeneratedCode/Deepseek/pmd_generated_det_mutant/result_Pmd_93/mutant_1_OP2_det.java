class DontCallThreadRun {
    public static void main(String[] args) {
        showBug();
    }
public static void showBug() {
    Thread t = new Thread(new Runnable() { public void run() { System.out.println("This is a bug"); } });
    t = new Thread(new Runnable() { public void run() { System.out.println("This is a bug"); } });
    t.run();
    new Thread(new Runnable() { public void run() { System.out.println("This is a bug"); } } ).run();
}
}