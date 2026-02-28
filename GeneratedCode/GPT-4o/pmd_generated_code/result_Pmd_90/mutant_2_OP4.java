class ThreadGroupExample {

    public static void main(String[] args) {
        ThreadGroupExample example = new ThreadGroupExample();
        System.out.println(example.showBug("Example Group"));
    }

    public String showBug(String groupName) {
        ThreadGroup tg = new ThreadGroup(groupName); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "Subgroup"); // BUG: AvoidThreadGroup
        tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        tg = System.getSecurityManager().getThreadGroup(); // BUG: AvoidThreadGroup

        // Unreachable if-else branch
        boolean condition = getDynamicCondition(); // Dynamic condition to prevent compile-time constant
        if (condition) {
            System.out.println("This branch will never be executed.");
        } else {
            System.out.println("This branch will always be executed.");
        }

        return tg.getName();
    }

    // Method to ensure runtime evaluation of condition
    private boolean getDynamicCondition() {
        return false;
    }
}