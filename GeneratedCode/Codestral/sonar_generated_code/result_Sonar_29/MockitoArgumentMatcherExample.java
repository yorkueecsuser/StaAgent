class MockitoArgumentMatcherExample {
    private Service service;

    // Import of Mockito library is removed to demonstrate the bug

    public void showBug() {
        service = new Service() {
            @Override
            public String someMethod(int param1, String param2) {
                return null;
            }
        };
        // BUG: Mockito argument matchers should be used on all parameters
        // Here, only "param2" has a matcher (which is a string literal "test").
        // This will trigger an exception when using Mockito as intended.
        if (service.someMethod(Integer.MIN_VALUE, "test")!= null) {
            throw new RuntimeException("Mockito argument matcher bug triggered");
        }
    }

    interface Service {
        String someMethod(int param1, String param2);
    }
}