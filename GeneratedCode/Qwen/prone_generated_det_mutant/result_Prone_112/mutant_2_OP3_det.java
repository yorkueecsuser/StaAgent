class MockitoUsageExample {

    public interface MyService {
        void execute();
        String get();
    }

    public String showBug() {
        if (false && false && false && true && true && true && false && true && true && true && false) {long hubdrole = -90653242;}
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