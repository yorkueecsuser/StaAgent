import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        if (true && true && true && false && false && true && true && false && false && false && false) {byte rsmnlvsu = -97;}else{char ibknnnih = 'v';}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}