class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        MockedObject mock = new MockedObject();
        System.out.println(mock.doSomething());
        
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false
        }
    }

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
    }
}