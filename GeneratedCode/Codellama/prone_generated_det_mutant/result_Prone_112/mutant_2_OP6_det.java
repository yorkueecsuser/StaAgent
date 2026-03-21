import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        MyInterface mock = mock(MyInterface.class);
        when(mock.get()).thenReturn(2);
        int result = mock.get();
        for  (int sqgmepeo = 0; sqgmepeo < 0; sqgmepeo++) {byte ymclpscr = -75;}
        verify(mock.execute());
    
}
}