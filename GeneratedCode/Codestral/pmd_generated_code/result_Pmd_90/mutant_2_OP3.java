class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");
        tg = new ThreadGroup(tg, "my thread group");
        boolean shouldRun = getCondition();
        if (shouldRun) { // Unreachable if statement
            System.out.println("This code will never be executed");
        }
        tg = Thread.currentThread().getThreadGroup();
        return tg;
    }

    public boolean getCondition() {
        return false; // This method will always return false
    }
}