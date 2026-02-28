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
        
        // Introduce an unreachable for loop
        boolean conditionFor = getCondition(); // Using a method to prevent compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }
        
        return tg.getName();
    }

    // Method to simulate condition check
    public boolean getCondition() {
        return false; // The condition is false, but it's determined at runtime
    }
}