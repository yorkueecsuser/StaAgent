class AvoidThreadGroupBug {
    private boolean getFalseCondition() {
        return false;
    }

    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");
        tg = new ThreadGroup(tg, "my thread group");
        tg = Thread.currentThread().getThreadGroup();

        if (getFalseCondition()) {
            // This block will never be executed
            System.out.println("Unreachable code block");
        } else {
            // Original code continues here
        }

        return tg;
    }
}