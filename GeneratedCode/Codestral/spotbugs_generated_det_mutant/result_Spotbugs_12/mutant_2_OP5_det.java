import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        int ssuuzyvd = 0;switch  (ssuuzyvd) {case 1:int zvukdssk = 407848950;break;default:short fvpajrmx = -8618;break;}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}