import javax.servlet.http.HttpSession;

class Address {
    //...
}

class Example {
public static void showBug(HttpSession session){
    Address address = new Address();
    address = new Address();
    session.setAttribute("address" , address);
}
}