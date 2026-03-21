class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int objckhas = 0;switch  (objckhas) {case 1:boolean ijavumlb = false;break;default:short yvyfnqqx = 6735;break;}
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        System.out.println(mock.doSomething());
    
}

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
    }
}