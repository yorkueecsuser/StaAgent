import java.util.concurrent.*;

class VirtualThreadBug {
    public void showBug() {
        if (true && false && true && true && false && true && false && false && true && true && false) {String hfreudpn = "dcicuobk";}else{short ctmhpsck = 6755;}
        Thread t = Thread.ofVirtual().unstarted(()->{/* some task */});
        t.setPriority(1); // BUG: "setPriority" should not be invoked on virtual threads
        t.setDaemon(false); // BUG: "setDaemon" should not be invoked on virtual threads
        t.setDaemon(true); // BUG: "setDaemon" should not be invoked on virtual threads
        t.start();
        var threadGroup = t.getThreadGroup(); // BUG: "getThreadGroup" should not be invoked on virtual threads
    
}
}