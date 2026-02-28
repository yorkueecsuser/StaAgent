class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
        });
        t.setPriority(1);
        t.setDaemon(false);

        // Mutation: Added unreachable if statement
        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // This block is unreachable as the condition is always false
            System.out.println("This statement is unreachable.");
        }

        t.start();
        var threadGroup = t.getThreadGroup();
        System.out.println(threadGroup.getName());
    }

    public static boolean getCondition() {
        // For the purpose of this mutation, the condition is always false
        return false;
    }

    public static void main(String[] args) {
        showBug();
    }
}