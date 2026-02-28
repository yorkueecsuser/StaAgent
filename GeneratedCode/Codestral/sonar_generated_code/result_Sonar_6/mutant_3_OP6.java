class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });
        t.setPriority(1); // Noncompliant; virtual threads' priority cannot be changed

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code block is unreachable
            System.out.println("This line will never be executed");
        }

        t.setDaemon(false); // Noncompliant; will throw IllegalArgumentException
        t.start();
        var threadGroup = t.getThreadGroup(); // Noncompliant; virtual thread groups should not be used
        System.out.println(threadGroup.getName());
    }

    public static boolean getCondition() {
        // This method always returns false, making the for loop unreachable
        return false;
    }

    public static void main(String[] args) {
        showBug();
    }
}