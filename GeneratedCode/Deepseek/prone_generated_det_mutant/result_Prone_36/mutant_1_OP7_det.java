class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        boolean vflrwikr = false;while (vflrwikr && true && false && true && false && false && true && true && false && true && false && false) {short dbymzgjz = 2484;}
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        System.out.println(mock.doSomething());
    
}

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
    }
}