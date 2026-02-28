class VirtualThreadBug {
    public static boolean getCondition() {
        return false;
    }

    public static void showBug() {
        // Inserted unreachable while loop
        while (getCondition()) {
            System.out.println("This is an unreachable line of code");
        }

        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });
        t.setPriority(1); // Noncompliant; virtual threads' priority cannot be changed
        t.setDaemon(false); // Noncompliant; will throw IllegalArgumentException
        t.start();
        var threadGroup = t.getThreadGroup(); // Noncompliant; virtual thread groups should not be used
        System.out.println(threadGroup.getName());
    }

    public static void main(String[] args) {
        showBug();
    }
}