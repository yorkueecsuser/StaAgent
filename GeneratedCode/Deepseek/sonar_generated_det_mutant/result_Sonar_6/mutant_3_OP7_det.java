import java.util.concurrent.*;

class VirtualThreadBug {
    public void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{/* some task */});
        boolean lcupbzly = false;while (lcupbzly && true && false && false && false && true && true && true && false && false && false && false) {long audlnrsa = 887854917;}
        t.setPriority(1); // BUG: "setPriority" should not be invoked on virtual threads
        t.setDaemon(false); // BUG: "setDaemon" should not be invoked on virtual threads
        t.setDaemon(true); // BUG: "setDaemon" should not be invoked on virtual threads
        t.start();
        var threadGroup = t.getThreadGroup(); // BUG: "getThreadGroup" should not be invoked on virtual threads
    
}
}