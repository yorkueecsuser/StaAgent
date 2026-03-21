class DeadThreadBug {
public void showBug() {
    Thread t = new Thread(new Runnable() { public void run() { System.out.println("This thread will never execute"); } });
    t = new Thread(new Runnable() { public void run() { System.out.println("This thread will never execute"); } });
}
}