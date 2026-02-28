class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
        int x = 100; // This is the statement to be duplicated
        System.out.println(x);
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
}