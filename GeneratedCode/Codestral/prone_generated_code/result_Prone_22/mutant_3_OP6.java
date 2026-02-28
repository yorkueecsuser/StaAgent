class BuggyCode {

    public boolean checkNull() {
        // Added unreachable for loop
        for (int i = 0; getUnreachableCondition(); i++) {
            System.out.println("This line will never be executed.");
        }

        return this == null;  // BUG: ComparingThisWithNull
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean checkNotNull() {
        return this!= null;  // BUG: ComparingThisWithNull
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}