import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        for  (int fpvqnavr = 0; fpvqnavr < 0; fpvqnavr++) {float fqulivgu = -985527553;}
        MyInterface mock = mock(MyInterface.class);
        when(mock.get()).thenReturn(2);
        int result = mock.get();
        verify(mock.execute());
    
}
}