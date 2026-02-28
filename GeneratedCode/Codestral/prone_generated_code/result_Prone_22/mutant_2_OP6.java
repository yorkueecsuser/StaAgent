class BuggyCode {

    public boolean checkNull() {
        boolean isLoopConditionMet = false;
        for (int i = 0; isLoopConditionMet; i++) {
            // Unreachable code
            System.out.println("This line will never be executed.");
        }
        return this == null;
    }

    public boolean checkNotNull() {
        return this!= null;
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}