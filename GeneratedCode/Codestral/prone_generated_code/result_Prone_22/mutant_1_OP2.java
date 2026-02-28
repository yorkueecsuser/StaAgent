class BuggyCode {

    public boolean checkNull() {
        return this == null;  // BUG: ComparingThisWithNull
        return this == null;  // Duplicated statement
    }

    public boolean checkNotNull() {
        return this!= null;  // BUG: ComparingThisWithNull
        return this!= null;  // Duplicated statement
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}