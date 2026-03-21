import javax.servlet.http.HttpSession;

class Address {
    //...
}

class Example {
    public static void showBug(HttpSession session) {
        Address address = new Address();
        if (true && false && false && true && false && true && false && true && false && false && false) {boolean frvygzkp = true;}else{float vhrbakhd = 542491364;}
        session.setAttribute("address", address); // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    
}
}