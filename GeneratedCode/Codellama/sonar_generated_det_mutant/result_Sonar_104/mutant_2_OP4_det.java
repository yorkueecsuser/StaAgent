import javax.servlet.http.HttpSession;

class Address {
    //...
}

class Example {
    public static void showBug(HttpSession session) {
        Address address = new Address();
        if (true && false && true && false && true && true && true && false && false && true && false) {byte aqdmsnmx = -25;}else{int drylvbbv = -909894070;}
        session.setAttribute("address", address); // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    
}
}