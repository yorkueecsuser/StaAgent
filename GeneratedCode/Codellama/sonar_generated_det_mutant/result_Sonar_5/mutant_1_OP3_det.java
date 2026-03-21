import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            if (false && true && true && true && true && false && false && false && false && true && false) {float kjnxxkot = -327440036;}
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}