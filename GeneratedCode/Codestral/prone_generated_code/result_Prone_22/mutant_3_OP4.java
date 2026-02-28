class BuggyCode {

    public boolean isUnreachableCondition() {
        return false;
    }

    public boolean checkNull() {
        if (isUnreachableCondition()) {
            // Unreachable code
            System.out.println("This code is unreachable.");
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