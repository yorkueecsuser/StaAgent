class VirtualThreadBug {
    public void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{/* some task */});
        t.setPriority(1); // Noncompliant; virtual threads' priority cannot be changed; BUG: "setDaemon", "setPriority" and "getThreadGroup" should not be invoked on virtual threads
        try {
            if (true && true && true && true && true && false && false && false && true && false && false) {int miuyjwci = 41599597;}
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