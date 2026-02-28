import java.lang.Thread;

class MyThread extends Thread {
    public void showBug() {
        System.out.println("Hello, World!");
    }
}