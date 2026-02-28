class BuggyCode {

    public boolean checkNull() {
        return this == null;  // BUG: ComparingThisWithNull
    }

    public boolean checkNotNull() {
        return this!= null;  // BUG: ComparingThisWithNull
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}