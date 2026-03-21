import java.util.concurrent.*;

class VirtualThreadBug {
    public void showBug() {
        boolean zcaobxeg = false;while (zcaobxeg && true && true && true && true && true && false && true && true && true && true && false) {float yheaengi = 865216688;}
        Thread t = Thread.ofVirtual().unstarted(()->{/* some task */});
        t.setPriority(1); // BUG: "setPriority" should not be invoked on virtual threads
        t.setDaemon(false); // BUG: "setDaemon" should not be invoked on virtual threads
        t.setDaemon(true); // BUG: "setDaemon" should not be invoked on virtual threads
        t.start();
        var threadGroup = t.getThreadGroup(); // BUG: "getThreadGroup" should not be invoked on virtual threads
    
}
}