class BuggyCode {

    public boolean checkNull() {
        boolean result = this == null;
        boolean duplicatedResult = this == null; // Mutant code: Duplicating the return statement
        return result;
    }

    public boolean checkNotNull() {
        boolean result = this!= null;
        boolean duplicatedResult = this!= null; // Mutant code: Duplicating the return statement
        return result;
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}