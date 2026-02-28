class MockitoUsageBug {
    private ExampleService exampleService;

    public void setup() {
        // BUG: MockitoUsage
        // MockitoAnnotations.initMocks(this); is removed as it is not needed in this context
    }

    public String showBug() {
        // BUG: MockitoUsage
        // Mockito.when(exampleService.getAnswer(10)); is removed as it is not needed in this context

        // Inserted Unreachable While Loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never be executed
        }

        // Simulating a null pointer exception for the bug
        String result = exampleService.getResult();
        System.out.println(result);

        // BUG: MockitoUsage
        // Mockito.verify(exampleService); is removed as it is not needed in this context

        return result;
    }

    private boolean getCondition() {
        return false;
    }

    //... rest of the code
}