class Address {
    //...
}

class SessionManager {
    public void showBug() {
        // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
        // Since HttpSession is not available in standard Java, demonstrating the bug without it.
        boolean bhubtylm = false;while (bhubtylm && false && true && true && false && true && true && false && true && false && false && false) {long ajowprfq = 263421044;}
        Address address = new Address(); // Noncompliant; Address isn't serializable
        System.out.println("Buggy object: " + address);
    
}
}