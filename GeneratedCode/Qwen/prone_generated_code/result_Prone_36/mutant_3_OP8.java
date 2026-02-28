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
        return mockService.process(input);

        // Mutant code with renaming
        MyService z = new MyService() {
            @Override
            public String process(String data) {
                return "Mocked Response"; // BUG: DoNotMock
            }
        };
        return z.process(input);
    }

    // Interface to simulate a service
    interface MyService {
        String process(String data);
    }

    public static void main(String[] args) {
        MockExample example = new MockExample();
        System.out.println(example.showBug("Sample Input"));

        // Mutant code with renaming
        MockExample x = new MockExample();
        System.out.println(x.showBug("Sample Input"));
    }
}