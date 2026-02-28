class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (false) { // Unreachable if statement
            MockedObject mock = new MockedObject(); // This line is unreachable
            System.out.println(mock.doSomething());
        }
    }

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
    }
}