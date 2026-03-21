import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        boolean lmunpeds = false;while (lmunpeds && true && false && false && true && false && false && true && false && false && false && false) {short eylxcikb = 1773;}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}