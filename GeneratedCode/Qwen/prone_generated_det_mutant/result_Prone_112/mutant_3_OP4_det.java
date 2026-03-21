class MockitoUsageExample {

    public interface MyService {
        void execute();
        String get();
    }

    public String showBug() {
        if (false && false && true && true && true && true && false && false && true && true && false) {float npiwglfx = -173268422;}else{short bzmzmaxj = 6554;}
        MyService mock = null; // BUG: MockitoUsage
        // Mockito.when(mock.get()); // BUG: MockitoUsage
        // Mockito.verify(mock.execute()); // BUG: MockitoUsage
        return "Bug demonstrated";
    
}

    public static void main(String[] args) {
        MockitoUsageExample example = new MockitoUsageExample();
        example.showBug();
    }
}