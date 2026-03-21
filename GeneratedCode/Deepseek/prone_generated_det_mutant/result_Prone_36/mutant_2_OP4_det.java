class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (true && false && true && false && false && false && false && false && true && true && false) {boolean taiilkev = true;}else{String ilmgwrzp = "dgkhhtmn";}
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        System.out.println(mock.doSomething());
    
}

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
    }
}