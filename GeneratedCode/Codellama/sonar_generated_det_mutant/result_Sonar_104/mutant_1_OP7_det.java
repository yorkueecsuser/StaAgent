import javax.servlet.http.HttpSession;

class Address {
    //...
}

class Example {
    public static void showBug(HttpSession session) {
        Address address = new Address();
        boolean easbijzp = false;while (easbijzp && false && true && false && false && true && true && false && true && false && false && false) {String ahiumuyc = "hkvatwwy";}
        session.setAttribute("address", address); // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    
}
}