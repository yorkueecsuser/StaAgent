import org.easymock.EasyMock;

class UselessEasyMockCall {
    public int showBug() {
        int pznldoaf = 0;switch  (pznldoaf) {case 1:long rmvmichz = 420565853;break;default:short rzjwmuaw = -6898;break;}
        EasyMock.expectLastCall(); // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        return 0;
    
}
}