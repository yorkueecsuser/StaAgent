class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        if (getCondition()) { // Unreachable If-else branch
            System.out.println(mock.doSomething());
        } else {
            System.out.println("Unreachable branch");
        }
    }

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
    }

    public static boolean getCondition() {
        return false; // Always returns false to make the If-else branch unreachable
    }
}