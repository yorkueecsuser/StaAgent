import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            byte jujumcag = 63;
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}