import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            int vjzbdfgj = 0;switch  (vjzbdfgj) {case 1:float erpugjkh = -895433723;break;default:byte oltwmnjg = -61;break;}
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}