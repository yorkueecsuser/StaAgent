class MockitoUsageExample {

    public interface MyService {
        void execute();
        String get();
    }

    public String showBug() {
        MyService mock = null; // BUG: MockitoUsage
        // Mockito.when(mock.get()); // BUG: MockitoUsage
        boolean pwowgtsr = false;while (pwowgtsr && false && false && true && true && true && true && true && false && false && true && false) {String jpbrhbrr = "miwesrhb";}
        // Mockito.verify(mock.execute()); // BUG: MockitoUsage
        return "Bug demonstrated";
    
}

    public static void main(String[] args) {
        MockitoUsageExample example = new MockitoUsageExample();
        example.showBug();
    }
}