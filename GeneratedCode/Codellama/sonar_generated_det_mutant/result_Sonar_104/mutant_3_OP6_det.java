import javax.servlet.http.HttpSession;

class Address {
    //...
}

class Example {
    public static void showBug(HttpSession session) {
        Address address = new Address();
        for  (int ugpttrnt = 0; ugpttrnt < 0; ugpttrnt++) {boolean sdnhzrma = false;}
        session.setAttribute("address", address); // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    
}
}