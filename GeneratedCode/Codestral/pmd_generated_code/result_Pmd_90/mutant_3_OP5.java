class AvoidThreadGroupBug {
    public ThreadGroup showBug() {
        ThreadGroup tg = new ThreadGroup("My threadgroup");
        tg = new ThreadGroup(tg, "my thread group");
        // Mutation using Unreachable Switch Statement
        int value = getImpossibleValue();
        switch (value) {
            case 1:
                // This code will never be reached, as `value` will never be 1
                tg = Thread.currentThread().getThreadGroup();
                break;
        }
        return tg;
    }

    // Helper method to always return an impossible value
    private int getImpossibleValue() {
        return -1;
    }
}