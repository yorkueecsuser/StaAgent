class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        System.out.println(mock.doSomething());
        // Additional code that makes the control flow unreachable by adding an if statement
        boolean condition = getCondition();
        if (condition == false) {
            System.out.println("This code is unreachable");
        }
    }

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
    }

    // This method is used to generate a boolean value at runtime that will make the if condition unreachable
    public static boolean getCondition() {
        return false;
    }
}