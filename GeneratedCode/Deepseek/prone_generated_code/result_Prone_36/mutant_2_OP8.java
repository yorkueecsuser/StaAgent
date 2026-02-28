class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        RenamedMockedObject renamedMock = new RenamedMockedObject(); // Mutation: Renaming
        System.out.println(renamedMock.doSomething());
    }

    static class RenamedMockedObject { // Mutated object
        public int doSomething() {
            return 100;
        }
    }
}