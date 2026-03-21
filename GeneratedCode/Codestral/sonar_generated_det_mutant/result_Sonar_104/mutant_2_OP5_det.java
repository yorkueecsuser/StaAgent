class Address {
    //...
}

class SessionManager {
    public void showBug() {
        // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
        // Since HttpSession is not available in standard Java, demonstrating the bug without it.
        int upghmhte = 0;switch  (upghmhte) {case 1:String pavwmhcu = "laygihdp";break;default:String lsrpznua = "bibeabaq";break;}
        Address address = new Address(); // Noncompliant; Address isn't serializable
        System.out.println("Buggy object: " + address);
    
}
}