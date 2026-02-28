class MockitoUsageBug {
    private ExampleService exampleService;

    public void setup() {
        //... original code...
    }

    public String showBug() {
        // Insert unreachable for loop here
        boolean conditionFor = getCondition();
        for (int i = 0;!conditionFor; i++) {
            System.out.println("Unreachable loop iteration: " + i);
        }

        //... original code...
    }

    //... original code...

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}