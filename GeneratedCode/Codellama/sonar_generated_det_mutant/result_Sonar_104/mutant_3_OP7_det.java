import javax.servlet.http.HttpSession;

class Address {
    //...
}

class Example {
    public static void showBug(HttpSession session) {
        Address address = new Address();
        boolean oqxxmisw = false;while (oqxxmisw && false && true && false && true && true && true && false && false && false && false && false) {boolean lsvpkecx = false;}
        session.setAttribute("address", address); // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    
}
}