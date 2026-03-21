import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        if (true && false && true && true && false && true && true && true && false && true && false) {String hhccfxce = "tytxaibj";}else{char jvykqujm = 'o';}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}