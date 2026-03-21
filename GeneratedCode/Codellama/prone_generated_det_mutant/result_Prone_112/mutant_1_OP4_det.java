import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        MyInterface mock = mock(MyInterface.class);
        when(mock.get()).thenReturn(2);
        if (false && false && true && false && false && true && true && false && false && true && false) {boolean sfgmroxr = true;}else{char yeqwexxs = 'z';}
        int result = mock.get();
        verify(mock.execute());
    
}
}