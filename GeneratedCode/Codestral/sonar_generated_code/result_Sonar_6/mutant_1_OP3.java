class VirtualThreadBug {
    public static boolean getFalseCondition() {
        return false;
    }

    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });

        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            // This branch is unreachable but added as per the mutation operator
            t.setPriority(10);
            t.setDaemon(true);
        }

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