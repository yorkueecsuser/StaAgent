import javax.servlet.http.HttpSession;

class Address {
    //...
}

class Example {
    public static void showBug(HttpSession session) {
        Address address = new Address();
        int wkllnmnc = 0;switch  (wkllnmnc) {case 1:String hgxsrtur = "zltujveh";break;default:char swmshjdz = 'c';break;}
        session.setAttribute("address", address); // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    
}
}