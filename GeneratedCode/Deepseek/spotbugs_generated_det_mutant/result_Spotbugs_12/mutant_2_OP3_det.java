import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        if (true && true && false && true && false && true && false && false && true && true && false) {byte hyanbmsq = -42;}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}