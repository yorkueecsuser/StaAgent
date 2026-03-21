class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int wqjwwnux = 0;switch  (wqjwwnux) {case 1:String yaztssoj = "tnyduwup";break;default:int whgfugfr = -660128553;break;}
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        System.out.println(mock.doSomething());
    
}

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
    }
}