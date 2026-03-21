import java.lang.Thread;

class MyThread extends Thread {
    public void showBug() {
        if (true && false && true && false && false && false && false && false && true && false && false) {int vdiyould = 53501516;}else{char zlpptsae = 'r';}
        System.out.println("Hello, World!");
    
}
}