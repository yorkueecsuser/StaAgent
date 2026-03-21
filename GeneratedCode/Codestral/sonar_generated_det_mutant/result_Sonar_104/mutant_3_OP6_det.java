class Address {
    //...
}

class SessionManager {
    public void showBug() {
        // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
        // Since HttpSession is not available in standard Java, demonstrating the bug without it.
        for  (int tmbjixhv = 0; tmbjixhv < 0; tmbjixhv++) {char xghedbvk = 'k';}
        Address address = new Address(); // Noncompliant; Address isn't serializable
        System.out.println("Buggy object: " + address);
    
}
}