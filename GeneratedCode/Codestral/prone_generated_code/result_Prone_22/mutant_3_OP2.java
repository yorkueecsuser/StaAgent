class BuggyCode {

    public boolean checkNull() {
        return this == null;  // BUG: ComparingThisWithNull
        return this == null;  // Duplicated statement based on the "Duplication" Mutation Operator
    }

    public boolean checkNotNull() {
        return this!= null;  // BUG: ComparingThisWithNull
        return this!= null;  // Duplicated statement based on the "Duplication" Mutation Operator
    }

    public boolean[] showBug() {
        return new boolean[]{checkNull(), checkNotNull()};
    }
}