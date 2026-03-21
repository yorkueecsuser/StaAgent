import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        boolean ouqrlcmd = false;while (ouqrlcmd && true && true && true && false && true && false && true && false && true && true && false) {byte nzbsmznt = 13;}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}