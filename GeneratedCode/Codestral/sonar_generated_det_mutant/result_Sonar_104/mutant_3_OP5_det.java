class Address {
    //...
}

class SessionManager {
    public void showBug() {
        // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
        // Since HttpSession is not available in standard Java, demonstrating the bug without it.
        int hyvqrpzh = 0;switch  (hyvqrpzh) {case 1:int zdwtkrht = 859809962;break;default:String wwiryhpu = "nrnmcfeu";break;}
        Address address = new Address(); // Noncompliant; Address isn't serializable
        System.out.println("Buggy object: " + address);
    
}
}