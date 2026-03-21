import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            for  (int txgrzhfp = 0; txgrzhfp < 0; txgrzhfp++) {byte cxxqlfqw = 0;}
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}