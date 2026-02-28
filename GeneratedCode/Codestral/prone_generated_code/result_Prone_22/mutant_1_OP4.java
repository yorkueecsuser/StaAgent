class BuggyCode {

    public boolean alwaysFalse() {
        return false;
    }

    public boolean checkNull() {
        if (alwaysFalse()) {
            // Unreachable code branch
            System.out.println("This branch should never execute.");
        } else {
            return this == null;
        }
    }

    public boolean checkNotNull() {
        return this!= null;
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}