import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            boolean cbbzmofu = false;while (cbbzmofu && true && false && false && false && false && true && true && false && true && false && false) {int tohyzjfe = 118560475;}
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}