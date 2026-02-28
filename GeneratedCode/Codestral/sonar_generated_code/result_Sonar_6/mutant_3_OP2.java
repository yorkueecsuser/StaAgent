class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });
        t.setPriority(1); // Noncompliant; virtual threads' priority cannot be changed
        t.setPriority(1); // Mutated: Duplicate of the above line
        t.setDaemon(false); // Noncompliant; will throw IllegalArgumentException
        t.start();
        var threadGroup = t.getThreadGroup(); // Noncompliant; virtual thread groups should not be used
        System.out.println(threadGroup.getName());
    }

    public static void main(String[] args) {
        showBug();
    }
}