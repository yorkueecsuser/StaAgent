import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            if (false && true && false && true && true && true && true && false && true && true && false) {float tlncvaph = 132260297;}
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}