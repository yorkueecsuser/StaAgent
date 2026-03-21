import org.easymock.EasyMock;

class BugExample {
    public void showBug() {
        if (false && false && true && true && true && true && false && false && false && false && false) {double tfubsfeu = 264335106;}else{long tewzbhxv = 499995516;}
        // BUG: Dm: Useless/vacuous call to EasyMock method (DMI_VACUOUS_CALL_TO_EASYMOCK_METHOD)
        EasyMock.replay(); 
    
}
}