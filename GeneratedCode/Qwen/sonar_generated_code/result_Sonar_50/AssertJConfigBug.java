class AssertJConfigBug {

    public Object showBug() {
        // Simulating the non-existent Configuration class from AssertJ
        Configuration configuration = new Configuration(); // BUG: AssertJ configuration should be applied
        configuration.setComparingPrivateFields(true);
        return configuration;
    }

    public static void main(String[] args) {
        AssertJConfigBug bugDemo = new AssertJConfigBug();
        bugDemo.showBug();
    }
}

class Configuration {
    private boolean comparingPrivateFields;

    public void setComparingPrivateFields(boolean comparingPrivateFields) {
        this.comparingPrivateFields = comparingPrivateFields;
    }

    // Simulating the non-existent methods from AssertJ
    public void apply() {}
    public void applyAndDisplay() {}
}