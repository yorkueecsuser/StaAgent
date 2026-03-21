import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        MyInterface mock = mock(MyInterface.class);
        when(mock.get()).thenReturn(2);
        if (false && true && false && false && false && false && false && false && true && false && false) {boolean kqlwxpcy = true;}
        int result = mock.get();
        verify(mock.execute());
    
}
}