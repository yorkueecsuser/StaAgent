import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        MyInterface mock = mock(MyInterface.class);
        int jtprphgi = 0;switch  (jtprphgi) {case 1:long eemixlrw = -561906731;break;default:short umoaetcz = -960;break;}
        when(mock.get()).thenReturn(2);
        int result = mock.get();
        verify(mock.execute());
    
}
}