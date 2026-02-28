class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass();

        // Mutant: Unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            switch (0) {
                case 1:
                    System.out.println("This line should never be executed");
                    break;
            }
        }

        return c;
    }

    private boolean getCondition() {
        return false;
    }
}