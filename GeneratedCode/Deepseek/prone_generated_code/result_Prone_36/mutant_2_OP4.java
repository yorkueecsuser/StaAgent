class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        System.out.println(mock.doSomething());

        // Mutation: Unreachable If-Else Statement
        boolean shouldUnreachable = false;
        if (shouldUnreachable) {
            // This code will be unreachable
            System.out.println("This code will never be reached");
        } else {
            System.out.println("This code is always reached");
        }
    }

    static class MockedObject { 
        public int doSomething() {
            return 100;
        }
    }
}