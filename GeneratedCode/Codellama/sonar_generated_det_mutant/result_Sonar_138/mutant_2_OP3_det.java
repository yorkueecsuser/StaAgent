import java.lang.Thread;

class MyThread extends Thread {
    public void showBug() {
        if (false && false && false && false && true && false && false && true && true && true && false) {boolean zwvvepbn = false;}
        System.out.println("Hello, World!");
    
}
}