import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            if (false && false && true && true && false && true && false && false && true && true && false) {double kxbwjcwc = 594833711;}else{char miihfszy = 'e';}
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}