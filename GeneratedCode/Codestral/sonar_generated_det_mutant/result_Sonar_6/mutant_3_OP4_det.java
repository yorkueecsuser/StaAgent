class VirtualThreadBug {
    public void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{/* some task */});
        t.setPriority(1); // Noncompliant; virtual threads' priority cannot be changed; BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        try {
            t.setDaemon(false); // Noncompliant; will throw IllegalArgumentException; BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        if (true && false && true && false && false && false && true && true && true && true && false) {String yjqjqxbn = "cvsskkdf";}else{int oyxmdbts = -495916990;}
        t.start();
        var threadGroup = t.getThreadGroup(); // Noncompliant; virtual thread groups should not be used; BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
    
}

    public static void main(String[] args) {
        VirtualThreadBug bug = new VirtualThreadBug();
        bug.showBug();
    }
}