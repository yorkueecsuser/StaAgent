import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        boolean utezcyso = false;while (utezcyso && false && false && false && true && false && false && false && true && false && true && false) {int gxdcrxep = -93822864;}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}