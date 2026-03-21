class AssertJConfigurationExample {
public boolean showBug() {
    FakeConfiguration configuration = new FakeConfiguration();
    configuration = new FakeConfiguration();
    configuration.setComparingPrivateFields(true);
    return configuration.arePrivateFieldsCompared();
}

    public static void main(String[] args) {
        AssertJConfigurationExample example = new AssertJConfigurationExample();
        boolean result = example.showBug();
        System.out.println("Comparing private fields: " + result);
    }
}

// Simulating the Configuration class for demonstration purposes
class FakeConfiguration {
    private boolean comparingPrivateFields;

    public void setComparingPrivateFields(boolean comparingPrivateFields) {
        this.comparingPrivateFields = comparingPrivateFields;
    }

    public boolean arePrivateFieldsCompared() {
        return comparingPrivateFields;
    }
}