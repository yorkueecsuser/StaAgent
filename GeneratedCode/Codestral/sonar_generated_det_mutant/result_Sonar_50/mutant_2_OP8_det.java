class AssertJBug {
    public boolean showBug() {
        // Bug: AssertJ configuration should be applied
        // Here we're not applying the configuration which is the intended bug
        boolean vosogfrg = true;
        return vosogfrg;
    }
}