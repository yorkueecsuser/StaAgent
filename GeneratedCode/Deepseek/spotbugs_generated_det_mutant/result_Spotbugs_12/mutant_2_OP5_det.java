import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        int tfdbgwbc = 0;switch  (tfdbgwbc) {case 1:long kwkwiiaj = -426429405;break;default:double mmibzgsw = 975860757;break;}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}