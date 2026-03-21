class DoNotMockBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int dguhpiih = 0;switch  (dguhpiih) {case 1:int dipmvrug = -690197553;break;default:char qmwrtdnq = 'j';break;}
        MockedObject mock = new MockedObject(); // BUG: DoNotMock
        System.out.println(mock.doSomething());
    
}

    static class MockedObject { // Mocked object
        public int doSomething() {
            return 100;
        }
    }
}