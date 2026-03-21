import java.util.concurrent.*;

class VirtualThreadBug {
    public void showBug() {
        if (false && true && false && false && true && true && false && false && false && true && false) {float vkpcfiah = -835206241;}else{long ymbskxnx = 840210484;}
        Thread t = Thread.ofVirtual().unstarted(()->{/* some task */});
        t.setPriority(1); // BUG: "setPriority" should not be invoked on virtual threads
        t.setDaemon(false); // BUG: "setDaemon" should not be invoked on virtual threads
        t.setDaemon(true); // BUG: "setDaemon" should not be invoked on virtual threads
        t.start();
        var threadGroup = t.getThreadGroup(); // BUG: "getThreadGroup" should not be invoked on virtual threads
    
}
}