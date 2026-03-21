import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        MyInterface mock = mock(MyInterface.class);
        when(mock.get()).thenReturn(2);
        if (false && true && true && false && true && true && true && false && true && true && false) {byte hrmascnd = -43;}else{short ljcvmqgn = -4795;}
        int result = mock.get();
        verify(mock.execute());
    
}
}