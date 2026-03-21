class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String daysexqt = "oauhcnzy";
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        System.out.println(mock.doSomething());
    
}

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
    }
}