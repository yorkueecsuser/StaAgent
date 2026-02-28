class AssertJConfigurationBug {
    public void showBug() {
        // BUG: AssertJ configuration should be applied
        // The configuration is not applied, so it will not have any effect
        boolean comparingPrivateFields = true;
    }
}