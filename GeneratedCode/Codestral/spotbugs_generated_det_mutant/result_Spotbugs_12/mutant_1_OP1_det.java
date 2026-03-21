import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        float ludrhdne = 745567832;
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}