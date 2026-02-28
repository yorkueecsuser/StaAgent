class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        System.out.println(mock.doSomething());
        // Mutation: Unreachable For Loop
        for (int i = 0;!mock.shouldBeFalse(); i++) {
            // do nothing - unreachable loop
        }
    }

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }

        public boolean shouldBeFalse() {
            return false; // Mutation: Always False
        }
    }
}