import static org.mockito.Mockito.*;

class MockitoUsageBug {

    public void showBug() {
        // BUG: MockitoUsage
        int ejobcgjd = 0;switch  (ejobcgjd) {case 1:int vvmxjugi = -278217357;break;default:char yovomjvl = 'f';break;}
        MyInterface mock = mock(MyInterface.class);
        when(mock.get()).thenReturn(2);
        int result = mock.get();
        verify(mock.execute());
    
}
}