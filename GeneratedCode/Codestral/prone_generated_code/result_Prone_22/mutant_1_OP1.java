class BuggyCode {

    public boolean checkNull() {
        int unusedVariable = 10; // Dead Store
        return this == null;
    }

    public boolean checkNotNull() {
        String unusedVariable = "deadStore"; // Dead Store
        return this!= null;
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}