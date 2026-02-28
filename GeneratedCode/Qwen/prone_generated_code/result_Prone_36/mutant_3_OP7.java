class MockExample {

    // This method demonstrates the DoNotMock bug by using a mock-like object creation pattern.
    public String showBug(String input) {
        // Creating a mock-like object without using any external mocking frameworks
        MyService mockService = new MyService() {
            @Override
            public String process(String data) {
                return "Mocked Response"; // BUG: DoNotMock
            }
        };

        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }

        return mockService.process(input);
    }

    // Interface to simulate a service
    interface MyService {
        String process(String data);
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MockExample example = new MockExample();
        System.out.println(example.showBug("Sample Input"));
    }
}