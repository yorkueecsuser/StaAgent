import static org.mockito.Mockito.*;

class MockitoUsageBug {
public void showBug() {
    MyInterface mock = mock(MyInterface.class);
    mock = mock(MyInterface.class);
    when(mock.get() ).thenReturn(2);
    int result = mock.get();
    verify(mock.execute());
}
}