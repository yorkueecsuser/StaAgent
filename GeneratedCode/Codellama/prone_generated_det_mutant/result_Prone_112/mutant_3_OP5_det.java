import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        MyInterface mock = mock(MyInterface.class);
        when(mock.get()).thenReturn(2);
        int result = mock.get();
        int idlwahzw = 0;switch  (idlwahzw) {case 1:boolean xbwnmcev = false;break;default:double lwdoibuh = 204307553;break;}
        verify(mock.execute());
    
}
}