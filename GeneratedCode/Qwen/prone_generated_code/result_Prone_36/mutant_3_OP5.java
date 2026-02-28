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
                // This case is unreachable because condition is always false
                System.out.println("This will never be printed");
                break;
            case 1:
                // This case is always executed
                System.out.println("This will always be printed");
                break;
        }
        
        return mockService.process(input);
    }

    // Interface to simulate a service
    interface MyService {
        String process(String data);
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MockExample example = new MockExample();
        System.out.println(example.showBug("Sample Input"));
    }
}