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

        // Inserting an unreachable if statement
        boolean condition = isConditionMet();
        if (condition) {
            System.out.println("This block is unreachable due to the condition being false.");
        }
        
        return tg.getName();
    }

    // Helper method that always returns false
    private boolean isConditionMet() {
        return false;
    }
}