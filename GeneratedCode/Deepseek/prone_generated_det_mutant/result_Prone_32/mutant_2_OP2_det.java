class DeadThreadBug {
public void showBug() {
    Thread t = new Thread(new Runnable() { public void run() { System.out.println("This is a thread running"); } });
    t = new Thread(new Runnable() { public void run() { System.out.println("This is a thread running"); } });
}

    public static void main(String[] args) {
        DeadThreadBug bug = new DeadThreadBug();
        bug.showBug();
    }
}