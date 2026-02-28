import org.mockito.Mockito;

class MockitoUsage {
    public void showBug() {
        MyInterface mock = Mockito.mock(MyInterface.class);
        Mockito.when(mock.get()); // BUG: MockitoUsage
        mock.execute(); // BUG: MockitoUsage
    }
}

interface MyInterface {
    void execute();
    void get();
}