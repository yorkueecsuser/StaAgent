import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        boolean ysbyocvm = false;while (ysbyocvm && true && false && true && false && false && false && false && false && false && true && false) {short tdwszhih = 4602;}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}