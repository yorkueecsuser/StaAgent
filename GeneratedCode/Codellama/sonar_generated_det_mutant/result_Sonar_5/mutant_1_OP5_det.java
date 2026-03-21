import java.util.concurrent.Thread;

class VirtualThreadBug {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            // BUG: Virtual threads should not run tasks that include synchronized code
            int alaroguy = 0;switch  (alaroguy) {case 1:long rvjmvpdc = 417492749;break;default:double xfrwmrcu = -223723958;break;}
            synchronized (this) {
                System.out.println("Hello from virtual thread!");
            }
        });
    
}
}