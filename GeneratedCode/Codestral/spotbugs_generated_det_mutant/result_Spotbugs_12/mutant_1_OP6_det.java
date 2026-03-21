import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        for  (int lcohppdn = 0; lcohppdn < 0; lcohppdn++) {byte pkromrkq = -91;}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}