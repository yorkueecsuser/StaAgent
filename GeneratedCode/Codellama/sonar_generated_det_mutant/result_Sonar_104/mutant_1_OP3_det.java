import javax.servlet.http.HttpSession;

class Address {
    //...
}

class Example {
    public static void showBug(HttpSession session) {
        Address address = new Address();
        if (false && true && false && true && false && true && false && true && false && true && false) {String brutkdls = "apqgiznt";}
        session.setAttribute("address", address); // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    
}
}