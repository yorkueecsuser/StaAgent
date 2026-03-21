import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            if (false && true && true && false && true && false && false && false && false && false && false) {String pyhhbfzk = "tegdjsmu";}else{char ykttddgt = 'l';}
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}