import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            for  (int qfyldzwo = 0; qfyldzwo < 0; qfyldzwo++) {char kqizagla = 'c';}
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}