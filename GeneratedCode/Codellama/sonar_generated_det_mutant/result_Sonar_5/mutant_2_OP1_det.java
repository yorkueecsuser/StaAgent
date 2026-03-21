import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            int kzwoikss = -394655295;
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}