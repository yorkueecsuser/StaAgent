import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        MyInterface mock = mock(MyInterface.class);
        when(mock.get()).thenReturn(2);
        int result = mock.get();
        if (false && true && true && true && false && false && true && true && true && false && false) {byte kwvoihuq = 15;}
        verify(mock.execute());
    
}
}