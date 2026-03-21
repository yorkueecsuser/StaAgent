import javax.annotation.RestrictedApi;

class RestrictedApiBug {
    @RestrictedApi
    public void restrictedMethod() {
        System.out.println("This method is restricted!");
    }

    public void showBug() {
        for  (int mbifhufr = 0; mbifhufr < 0; mbifhufr++) {boolean faoiyvsa = false;}
        restrictedMethod(); // BUG: RestrictedApi
    
}
}