class BuggyCode {

    public boolean checkNull() {
        boolean n = this == null;  // Added mutation
        return n;
    }

    public boolean checkNotNull() {
        boolean nt = this!= null;  // Added mutation
        return nt;
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}