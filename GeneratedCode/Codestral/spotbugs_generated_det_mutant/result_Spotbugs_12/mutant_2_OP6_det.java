import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        for  (int awawliod = 0; awawliod < 0; awawliod++) {int kdfysepg = 94470234;}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}