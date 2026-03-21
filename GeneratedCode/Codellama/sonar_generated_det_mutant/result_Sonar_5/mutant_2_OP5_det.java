import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            int jxthkbuy = 0;switch  (jxthkbuy) {case 1:char vhdnllol = 'd';break;default:short euccwxla = -8244;break;}
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}