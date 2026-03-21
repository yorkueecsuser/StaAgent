import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        for  (int kaujjbpw = 0; kaujjbpw < 0; kaujjbpw++) {int jegcwvon = 370360956;}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}