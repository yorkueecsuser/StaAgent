import java.lang.Thread;

class MyThread extends Thread {
    public void showBug() {
        if (true && false && false && true && true && true && true && true && false && true && false) {long ntdmzaui = 804714896;}
        System.out.println("Hello, World!");
    
}
}