import javax.servlet.http.HttpSession;

class Address {
    //...
}

class Example {
    public static void showBug(HttpSession session) {
        Address address = new Address();
        boolean lyegwokr = false;while (lyegwokr && false && false && false && false && true && false && false && false && true && true && false) {double gthwdiau = 727412393;}
        session.setAttribute("address", address); // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    
}
}