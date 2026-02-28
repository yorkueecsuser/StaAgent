class AssertJConfigurationExample {

    public void showBug() {
        // Simulating Configuration as it cannot be imported
        FakeConfiguration configuration = new FakeConfiguration(); // BUG: AssertJ configuration should be applied
        configuration.setComparingPrivateFields(true);
        // The configuration is not applied, so it won't have any effect.

        // Mutant: Renaming variable 'configuration' to 'a'
        FakeConfiguration a = new FakeConfiguration();
        a.setComparingPrivateFields(true);
    }
}

// A placeholder class to simulate the non-existent Configuration class
class FakeConfiguration {
    public void setComparingPrivateFields(boolean value) {
        // Simulate setting configuration
    }
}