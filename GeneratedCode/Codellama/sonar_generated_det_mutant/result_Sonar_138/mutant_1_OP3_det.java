import java.lang.Thread;

class MyThread extends Thread {
    public void showBug() {
        if (true && false && true && true && false && true && true && true && true && false && false) {float xylgxdcn = -847996480;}
        System.out.println("Hello, World!");
    
}
}