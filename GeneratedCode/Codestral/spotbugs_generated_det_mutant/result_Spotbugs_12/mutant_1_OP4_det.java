import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        if (true && false && true && true && true && true && false && false && false && false && false) {float splwbhaj = 29866155;}else{short ogukujgd = -6949;}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}