import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        if (false && true && false && false && false && true && false && true && false && true && false) {float icvjmljw = 360538128;}else{float hrgsoobz = 42849018;}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}