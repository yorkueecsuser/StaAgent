class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        System.out.println(mock.doSomething());
        
        // Mutant Code: Add an unreachable while loop
        boolean unreachableCondition = false;
        while(unreachableCondition) {
            System.out.println("This line should be unreachable");
        }
    }

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
    }
}