import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        if (true && false && false && true && false && false && true && true && true && false && false) {int aohacmkc = 398240376;}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}