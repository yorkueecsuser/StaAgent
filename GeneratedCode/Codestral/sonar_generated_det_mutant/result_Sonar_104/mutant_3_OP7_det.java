class Address {
    //...
}

class SessionManager {
    public void showBug() {
        // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
        // Since HttpSession is not available in standard Java, demonstrating the bug without it.
        boolean tquttbjc = false;while (tquttbjc && true && false && false && false && false && true && false && false && true && false && false) {int sqqawoqk = -879218247;}
        Address address = new Address(); // Noncompliant; Address isn't serializable
        System.out.println("Buggy object: " + address);
    
}
}