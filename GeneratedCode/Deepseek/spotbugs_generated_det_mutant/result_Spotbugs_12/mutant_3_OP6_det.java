import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        for  (int vlfvretk = 0; vlfvretk < 0; vlfvretk++) {int ifdldwnf = -267101826;}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}