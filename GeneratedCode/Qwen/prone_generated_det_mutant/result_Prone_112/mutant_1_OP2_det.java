class MockitoUsageExample {

    public interface MyService {
        void execute();
        String get();
    }
public String showBug() {
    MyService mock = null;
    mock = null;
    return "Bug demonstrated";
}

    public static void main(String[] args) {
        MockitoUsageExample example = new MockitoUsageExample();
        example.showBug();
    }
}