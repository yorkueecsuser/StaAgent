class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        MockedObject mock = new MockedObject();
        System.out.println(mock.doSomething());
        // Unreachable While Loop Mutant
        boolean unreachableLoopCondition = getUnreachableCondition();
        while (unreachableLoopCondition) {
            System.out.println("Unreachable loop");
        }
    }

    static class MockedObject {
        public int doSomething() {
            return 100;
        }
    }

    public static boolean getUnreachableCondition() {
        return false;
    }
}