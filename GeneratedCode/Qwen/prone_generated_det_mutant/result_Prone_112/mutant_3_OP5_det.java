class MockitoUsageExample {

    public interface MyService {
        void execute();
        String get();
    }

    public String showBug() {
        MyService mock = null; // BUG: MockitoUsage
        // Mockito.when(mock.get()); // BUG: MockitoUsage
        int xcquhljh = 0;switch  (xcquhljh) {case 1:char vzagbjzr = 'o';break;default:byte newdcocm = -13;break;}
        // Mockito.verify(mock.execute()); // BUG: MockitoUsage
        return "Bug demonstrated";
    
}

    public static void main(String[] args) {
        MockitoUsageExample example = new MockitoUsageExample();
        example.showBug();
    }
}