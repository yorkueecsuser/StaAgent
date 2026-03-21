import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        for  (int kdpvziqe = 0; kdpvziqe < 0; kdpvziqe++) {int qrdihupr = -385932868;}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}