import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        if (false && true && false && true && false && false && true && false && false && true && false) {float sdxvbkbv = -761219931;}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}