class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        MockedObject mock = new MockedObject(); 
        System.out.println(mock.doSomething());

        // Unreachable For Loop Mutant
        for (int i = 0; getCondition(); i++) {
            // Do nothing
        }
    }

    static class MockedObject { 
        public int doSomething() {
            return 100;
        }
    }

    private static boolean getCondition() {
        return false;
    }
}