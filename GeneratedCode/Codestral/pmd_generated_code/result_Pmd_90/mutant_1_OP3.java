class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");
        tg = new ThreadGroup(tg, "my thread group");

        // Mutant code: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block should never execute");
        }

        tg = Thread.currentThread().getThreadGroup();
        return tg;
    }

    private boolean getCondition() {
        // Replace this with your own logic to determine the condition dynamically
        return false; // This always returns false to make the if statement unreachable
    }
}