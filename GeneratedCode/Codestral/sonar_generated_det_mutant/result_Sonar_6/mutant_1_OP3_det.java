class VirtualThreadBug {
    public void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{/* some task */});
        if (true && true && true && true && false && true && false && false && true && false && false) {float tgyjeuqz = -897792377;}
        t.setPriority(1); // Noncompliant; virtual threads' priority cannot be changed; BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        try {
            t.setDaemon(false); // Noncompliant; will throw IllegalArgumentException; BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        t.start();
        var threadGroup = t.getThreadGroup(); // Noncompliant; virtual thread groups should not be used; BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
    
}

    public static void main(String[] args) {
        VirtualThreadBug bug = new VirtualThreadBug();
        bug.showBug();
    }
}