class VirtualThreadBug {
    public static void showBug() {
        Thread t = Thread.ofVirtual().unstarted(()->{
            boolean conditionWhile = getCondition();
            while (conditionWhile) { // Mutant: Unreachable while loop
                System.out.println("This is an unreachable virtual thread block");
            }
            System.out.println("Virtual thread is running");
        });
        t.setPriority(1);
        t.setDaemon(false);
        t.start();
        var threadGroup = t.getThreadGroup();
        System.out.println(threadGroup.getName());
    }

    private static boolean getCondition() {
        return false; // Always returning false to make the while loop unreachable
    }

    public static void main(String[] args) {
        showBug();
    }
}