class Address {
    //...
}

class SessionManager {
public void showBug() {
    Address address = new Address();
    address = new Address();
    System.out.println("Buggy object: " + address);
}
}