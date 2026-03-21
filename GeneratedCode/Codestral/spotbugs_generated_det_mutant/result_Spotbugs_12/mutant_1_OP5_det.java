import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        int ntnaplda = 0;switch  (ntnaplda) {case 1:byte exuugirf = -35;break;default:float hxpdzhws = -979997610;break;}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}