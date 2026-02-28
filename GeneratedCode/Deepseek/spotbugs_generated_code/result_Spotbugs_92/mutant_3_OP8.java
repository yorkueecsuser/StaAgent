class SelfComparisonBug {
    public boolean showBug(int value) {
        int v = value; // Renamed variable 'value' to 'v'
        return v == v; // Bug: Self comparison of 'v' with itself (SA_LOCAL_SELF_COMPARISON)
    }
}