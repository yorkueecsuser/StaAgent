import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        int fvzzxmxw = 0;switch  (fvzzxmxw) {case 1:byte vqxlpbdw = 25;break;default:byte vrpnaiqu = 79;break;}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}