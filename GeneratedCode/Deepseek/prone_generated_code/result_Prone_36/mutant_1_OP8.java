class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Mock mock = new Mock(); // Mutant Code: Renaming, MockedObject renamed to Mock
        System.out.println(mock.doSomething());
    }

    static class Mock { // Mutant Code: Renaming, MockedObject renamed to Mock
        public int doSomething() {
            return 100;
        }
    }
}