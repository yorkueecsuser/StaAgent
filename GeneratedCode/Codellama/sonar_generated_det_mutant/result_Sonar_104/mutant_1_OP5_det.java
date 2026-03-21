import javax.servlet.http.HttpSession;

class Address {
    //...
}

class Example {
    public static void showBug(HttpSession session) {
        Address address = new Address();
        int flhbrgtq = 0;switch  (flhbrgtq) {case 1:byte proxgpur = 119;break;default:char qbyzwlnw = 'd';break;}
        session.setAttribute("address", address); // BUG: Non-serializable objects should not be stored in "javax.servlet.http.HttpSession" instances
    
}
}