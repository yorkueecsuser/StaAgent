class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        System.out.println(mock.doSomething());
    }

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
    }

    public static void unreachableSwitchStatementMutant() { // Unreachable Switch Statement Mutant
        int value = getValue();
        switch (value) {
            default:
                System.out.println("This code should never be reached");
        }
    }

    public static int getValue() {
        return 1; // This method is used to simulate dynamically determined value
    }
}