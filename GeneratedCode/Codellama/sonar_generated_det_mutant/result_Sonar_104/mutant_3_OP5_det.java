import javax.servlet.http.HttpSession;

class Address {
    //...
}

class Example {
    public static void showBug(HttpSession session) {
        Address address = new Address();
        int gjasrsbl = 0;switch  (gjasrsbl) {case 1:float obguinhn = 967298590;break;default:byte pnkeygeq = 96;break;}
        session.setAttribute("address", address); // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    
}
}