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

    // Mutation operator: Unreachable switch statement
    static void unreachableSwitchStatement() {
        boolean condition = false;
        switch(condition? 1 : 0) {
            case 0:
                break;
            case 1:
                System.out.println("This code is unreachable");
                break;
        }
    }
}