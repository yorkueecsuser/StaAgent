import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        MyInterface mock = mock(MyInterface.class);
        boolean wvjopqra = false;while (wvjopqra && false && true && true && true && true && true && false && true && false && false && false) {String rkgtoseh = "lolheleo";}
        when(mock.get()).thenReturn(2);
        int result = mock.get();
        verify(mock.execute());
    
}
}