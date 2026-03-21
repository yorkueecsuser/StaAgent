import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        if (true && true && false && false && false && false && true && false && false && false && false) {float qxmqjfwv = -410807245;}
        MyInterface mock = mock(MyInterface.class);
        when(mock.get()).thenReturn(2);
        int result = mock.get();
        verify(mock.execute());
    
}
}