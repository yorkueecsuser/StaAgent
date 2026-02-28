class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup"); // BUG: AvoidThreadGroup
        tg = new ThreadGroup(tg, "my thread group"); // BUG: AvoidThreadGroup
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This part of the code will be unreachable as the condition is always false
            tg = Thread.currentThread().getThreadGroup(); // BUG: AvoidThreadGroup
        } else {
            // Adding an alternative code block just to make sure the if-else statement is valid
            System.out.println("Unreachable code block");
        }
        return tg;
    }

    private boolean getCondition() {
        return false; // This ensures the if-else branch is unreachable
    }
}