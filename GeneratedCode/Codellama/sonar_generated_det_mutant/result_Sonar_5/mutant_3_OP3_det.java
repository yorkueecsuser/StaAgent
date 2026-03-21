import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            if (false && false && true && false && true && true && false && true && true && false && false) {float rlxpamkx = 480605943;}
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}