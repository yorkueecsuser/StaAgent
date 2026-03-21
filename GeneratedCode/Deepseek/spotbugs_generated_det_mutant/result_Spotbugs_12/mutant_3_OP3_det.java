import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        if (false && false && true && true && false && true && false && false && false && true && false) {short ofujzmcq = 7324;}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}