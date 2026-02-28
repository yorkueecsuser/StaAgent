class BuggyCode {

    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean checkNull() {
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code executed");
        }
        return this == null;
    }

    public boolean checkNotNull() {
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code executed");
        }
        return this!= null;
    }

    public boolean[] showBug() {
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code executed");
        }
        return new boolean[]{checkNull(), checkNotNull()};
    }
}