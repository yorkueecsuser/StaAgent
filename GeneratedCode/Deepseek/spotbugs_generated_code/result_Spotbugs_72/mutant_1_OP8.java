class UnrelatedTypesComparison {
    public boolean showBug(Object objRenamed, String str) {
        return objRenamed == str; // Bug is still present
    }
}