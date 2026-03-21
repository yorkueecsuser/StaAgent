import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            boolean gthgdvvv = false;while (gthgdvvv && true && true && true && true && false && false && true && true && true && false && false) {byte kcykuqjq = 56;}
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}