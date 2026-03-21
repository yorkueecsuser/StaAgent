import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        for  (int yajfgpki = 0; yajfgpki < 0; yajfgpki++) {char mqolshpn = 'e';}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}