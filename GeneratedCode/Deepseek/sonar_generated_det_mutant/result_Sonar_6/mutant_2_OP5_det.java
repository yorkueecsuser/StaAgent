import java.util.concurrent.*;

class VirtualThreadBug {
    public void showBug() {
        int udazmcup = 0;switch  (udazmcup) {case 1:String cobmzwzi = "vgkplkow";break;default:double fwjxhgbn = 46298305;break;}
        Thread t = Thread.ofVirtual().unstarted(()->{/* some task */});
        t.setPriority(1); // BUG: "setPriority" should not be invoked on virtual threads
        t.setDaemon(false); // BUG: "setDaemon" should not be invoked on virtual threads
        t.setDaemon(true); // BUG: "setDaemon" should not be invoked on virtual threads
        t.start();
        var threadGroup = t.getThreadGroup(); // BUG: "getThreadGroup" should not be invoked on virtual threads
    
}
}