import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        String rsfvpyew = "szshjwnd";
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}