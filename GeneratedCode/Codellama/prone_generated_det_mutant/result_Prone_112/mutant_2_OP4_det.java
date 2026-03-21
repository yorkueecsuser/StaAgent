import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        MyInterface mock = mock(MyInterface.class);
        if (false && true && false && false && true && false && true && false && true && true && false) {long zcjlhxpl = -532895964;}else{byte kjxxaanv = 14;}
        when(mock.get()).thenReturn(2);
        int result = mock.get();
        verify(mock.execute());
    
}
}