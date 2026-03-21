import java.util.concurrent.*;

class VirtualThreadBug {
    public void showBug() {
        int usrbotsg = 0;switch  (usrbotsg) {case 1:int zfunoyva = -442404372;break;default:double mbmkriyl = -969428429;break;}
        Thread t = Thread.ofVirtual().unstarted(()->{/* some task */});
        t.setPriority(1); // BUG: "setPriority" should not be invoked on virtual threads
        t.setDaemon(false); // BUG: "setDaemon" should not be invoked on virtual threads
        t.setDaemon(true); // BUG: "setDaemon" should not be invoked on virtual threads
        t.start();
        var threadGroup = t.getThreadGroup(); // BUG: "getThreadGroup" should not be invoked on virtual threads
    
}
}