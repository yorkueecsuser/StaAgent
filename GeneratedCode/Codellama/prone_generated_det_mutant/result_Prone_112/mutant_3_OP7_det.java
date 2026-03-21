import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        boolean etxosnnz = false;while (etxosnnz && false && false && false && true && false && true && true && true && false && false && false) {long gsoufqpe = 448348641;}
        MyInterface mock = mock(MyInterface.class);
        when(mock.get()).thenReturn(2);
        int result = mock.get();
        verify(mock.execute());
    
}
}