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

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be reached because condition is always false
                System.out.println("This is an unreachable case");
                break;
            default:
                // Default case to ensure switch is not empty and compiles successfully
                break;
        }

        return mockService.process(input);
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    // Interface to simulate a service
    interface MyService {
        String process(String data);
    }

    public static void main(String[] args) {
        MockExample example = new MockExample();
        System.out.println(example.showBug("Sample Input"));
    }
}