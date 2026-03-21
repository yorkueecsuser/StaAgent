import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            if (true && false && false && false && true && true && false && false && false && false && false) {float zrdeadrj = 525174791;}else{int aglqcnbt = -517714966;}
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}