import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        MyInterface mock = mock(MyInterface.class);
        when(mock.get()).thenReturn(2);
        int result = mock.get();
        boolean uraaivfs = false;while (uraaivfs && true && false && false && false && false && true && true && true && false && false && false) {float manntirg = 728112215;}
        verify(mock.execute());
    
}
}