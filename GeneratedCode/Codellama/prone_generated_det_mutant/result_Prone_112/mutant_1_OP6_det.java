import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        MyInterface mock = mock(MyInterface.class);
        when(mock.get()).thenReturn(2);
        for  (int nuwohcmr = 0; nuwohcmr < 0; nuwohcmr++) {char kjjxfrqw = 'y';}
        int result = mock.get();
        verify(mock.execute());
    
}
}