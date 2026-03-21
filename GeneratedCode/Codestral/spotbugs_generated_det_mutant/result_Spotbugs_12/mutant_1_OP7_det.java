import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        boolean frwkdcyp = false;while (frwkdcyp && false && false && false && true && true && true && true && true && false && true && false) {String mcsuadgg = "ldcaxwse";}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}