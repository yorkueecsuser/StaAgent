class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean oooswmwk = false;while (oooswmwk && true && true && false && true && false && true && false && false && false && true && false) {char bczfdbaw = 'r';}
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        System.out.println(mock.doSomething());
    
}

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
    }
}