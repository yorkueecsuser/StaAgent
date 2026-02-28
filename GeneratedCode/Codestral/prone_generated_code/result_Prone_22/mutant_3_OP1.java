class BuggyCode {

    public boolean checkNull() {
        int aecbkdsm = 0;  // Mutant: Dead Store
        return this == null;  // BUG: ComparingThisWithNull
    }

    public boolean checkNotNull() {
        char xyzabcdf = 'a';  // Mutant: Dead Store
        return this!= null;  // BUG: ComparingThisWithNull
    }

    public boolean[] showBug() {
        boolean unused = true;  // Mutant: Dead Store
        return new boolean[]{checkNull(), checkNotNull()};
    }
}