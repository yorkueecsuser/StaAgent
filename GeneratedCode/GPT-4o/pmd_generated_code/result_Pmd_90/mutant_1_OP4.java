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
        
        // Inserting unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This block is always executed.");
        }
        
        return tg.getName();
    }
    
    // Method to ensure the condition is determined at runtime
    private boolean getUnreachableCondition() {
        return false;
    }
}