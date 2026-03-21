class Address {
    //...
}

class SessionManager {
    public void showBug() {
        // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
        // Since HttpSession is not available in standard Java, demonstrating the bug without it.
        for  (int urmweekx = 0; urmweekx < 0; urmweekx++) {byte nnrqhxmj = -29;}
        Address address = new Address(); // Noncompliant; Address isn't serializable
        System.out.println("Buggy object: " + address);
    
}
}