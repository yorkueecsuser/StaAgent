class AvoidThreadGroupBug {
    private boolean getCondition() {
        return false; // This method returns false to make the loop condition unreachable
    }

    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");
        tg = new ThreadGroup(tg, "my thread group");

        // Inserted mutant: Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This code should be unreachable");
        }

        tg = Thread.currentThread().getThreadGroup();
        return tg;
    }
}