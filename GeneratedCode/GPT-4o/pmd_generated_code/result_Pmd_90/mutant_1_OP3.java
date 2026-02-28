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

        // Introducing a unique unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block is unreachable.");
        }

        return tg.getName();
    }

    // Helper method to provide a non-final condition
    private boolean getFalseCondition() {
        return false;
    }
}