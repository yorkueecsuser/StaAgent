class VirtualThreadBug {
    public static boolean getCondition() {
        return false; // This method always returns false to make the loop unreachable
    }

    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            System.out.println("Virtual thread is running");
            // Mutation: Unreachable for loop added here
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This block of code is unreachable
                System.out.println("This line is unreachable");
            }
        });
        t.setPriority(1);
        t.setDaemon(false);
        t.start();
        var threadGroup = t.getThreadGroup();
        System.out.println(threadGroup.getName());
    }

    public static void main(String[] args) {
        showBug();
    }
}