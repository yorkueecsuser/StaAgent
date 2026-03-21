import java.util.concurrent.*;

class VirtualThreadBug {
    public void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{/* some task */});
        int uypaxxbr = 0;switch  (uypaxxbr) {case 1:byte mzgdktxe = 47;break;default:long muquwwqi = 949794709;break;}
        t.setPriority(1); // BUG: "setPriority" should not be invoked on virtual threads
        t.setDaemon(false); // BUG: "setDaemon" should not be invoked on virtual threads
        t.setDaemon(true); // BUG: "setDaemon" should not be invoked on virtual threads
        t.start();
        var threadGroup = t.getThreadGroup(); // BUG: "getThreadGroup" should not be invoked on virtual threads
    
}
}