class VirtualThreadBug {
    public static boolean getUnreachableCondition() {
        return false;  // Method always returns false
    }

    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });

        if (getUnreachableCondition()) { // Inserted unreachable if-else branch
            t.setPriority(10);  // This line will never be executed
        } else {
            t.setPriority(1);
        }

        t.setDaemon(false); // Noncompliant; will throw IllegalArgumentException
        t.start();
        var threadGroup = t.getThreadGroup(); // Noncompliant; virtual thread groups should not be used
        System.out.println(threadGroup.getName());
    }

    public static void main(String[] args) {
        showBug();
    }
}